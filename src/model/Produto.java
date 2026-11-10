
package model;

public class Produto extends ItemVendavel {

    private String categoria;
    private int estoque;

    public Produto(int id, String nome, String descricao,
                   double preco, String categoria, int estoque) {

        super(id, nome, descricao, preco);

        this.categoria = categoria;
        this.estoque = estoque;
    }


    public String getCategoria() {
        return categoria;
    }

    public int getEstoque() {
        return estoque;
    }


    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
