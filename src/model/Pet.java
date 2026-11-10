package model;

public class Pet {

    private int id;
    private String nome;
    private String especie;

    public Pet(int id, String nome,String especie) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
    }
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
