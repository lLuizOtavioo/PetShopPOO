
package model;

public class ItemPedido {

    private ItemVendavel itemVendavel;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(ItemVendavel itemVendavel, int quantidade, double precoUnitario) {
        this.itemVendavel = itemVendavel;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }


    public double calcularSubtotal() {
        return quantidade * precoUnitario;
    }


    public ItemVendavel getItemVendavel() {
        return itemVendavel;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }


    public void setItemVendavel(ItemVendavel itemVendavel) {
        this.itemVendavel = itemVendavel;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
