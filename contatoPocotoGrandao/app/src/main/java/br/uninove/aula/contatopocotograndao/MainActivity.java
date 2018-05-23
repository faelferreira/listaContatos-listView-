package br.uninove.aula.contatopocotograndao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvContatos;
    private ArrayList<Contato>listContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContatos = (ListView)findViewById(R.id.lvContatos);

        listContato = new ArrayList<>();
       listContato.add(new Contato(1,"ellen","F",R.drawable.ellen));
       listContato.add(new Contato(2,"anita", "F",R.drawable.anita));
       listContato.add(new Contato(3,"babi","F",R.drawable.babi));
       listContato.add(new Contato(4,"beyonce","F",R.drawable.beyonce));
       listContato.add(new Contato(5,"daniela","F",R.drawable.daniela));
       listContato.add(new Contato(6,"jenifer","F",R.drawable.jenifer));
       listContato.add(new Contato(7,"nick","F",R.drawable.nick));
       listContato.add(new Contato(8,"outra","F",R.drawable.outra));

       ContatoAdapter adapter = new ContatoAdapter(this,listContato);
       lvContatos.setAdapter(adapter);
    }
}
