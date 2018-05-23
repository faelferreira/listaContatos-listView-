package br.uninove.aula.contatopocotograndao;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ContatoAdapter extends BaseAdapter {
    ArrayList<Contato>listContatos;
    LayoutInflater myLayoutInflater;

    public ContatoAdapter(Context  context,ArrayList<Contato>listContatos){
        this.listContatos = listContatos;
        this.myLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return this.listContatos.size();
    }

    @Override
    public Contato getItem(int position) {
        return this.listContatos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = this.myLayoutInflater.inflate(R.layout.contato_layout,null);
        Contato contato = this.getItem(position);
        ((ImageView)convertView.findViewById(R.id.fotoContato)).setImageResource(contato.getFoto());
        ((TextView)convertView.findViewById(R.id.nomeContato)).setText(contato.getNome());

        return convertView;
    }
}
