package model;

public class Funcionario {
    private int id;
    private String nome;
    private String cargo;
    private int experienciaAnos;
    private String formacaoAcademica;

    public Funcionario(int id, String nome,String cargo, int experienciaAnos, String formacaoAcademica) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.experienciaAnos = experienciaAnos;
        this.formacaoAcademica = formacaoAcademica;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getExperienciaAnos() {
            return experienciaAnos;
    }

    public String getCargo() {
        return cargo;
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void setExperienciaAnos(int experienciaAnos){

        this.experienciaAnos = experienciaAnos;
    }

    public void setFormacaoAcademica(String formacaoAcademica){
        this.formacaoAcademica = formacaoAcademica;
    }
}