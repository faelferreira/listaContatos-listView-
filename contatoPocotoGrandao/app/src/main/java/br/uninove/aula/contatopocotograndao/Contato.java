package br.uninove.aula.contatopocotograndao;

public class Contato {
    private int id;
    private String nome;
    private String genero;
    private int foto;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
    public Contato(int id, String nome, String genero, int foto) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.foto = foto;
    }
}
