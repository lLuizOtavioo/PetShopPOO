
package model;

public class Servico extends ItemVendavel {

    private int duracaoMinutos;

    public Servico(int id, String nome, String descricao,
                   double preco, int duracaoMinutos) {

        super(id, nome, descricao, preco);

        this.duracaoMinutos = duracaoMinutos;
    }

    // Getter
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    // Setter
    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
}
