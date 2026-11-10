
package model;

public class TaxiPet extends Servico {

    private double distanciaKm;
    private String enderecoOrigem;
    private String enderecoDestino;

    public TaxiPet(int id, String nome, String descricao,
                   double preco, int duracaoMinutos,
                   double distanciaKm, String enderecoOrigem,
                   String enderecoDestino) {

        super(id, nome, descricao, preco, duracaoMinutos);

        this.distanciaKm = distanciaKm;
        this.enderecoOrigem = enderecoOrigem;
        this.enderecoDestino = enderecoDestino;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public String getEnderecoOrigem() {
        return enderecoOrigem;
    }

    public String getEnderecoDestino() {
        return enderecoDestino;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public void setEnderecoOrigem(String enderecoOrigem) {
        this.enderecoOrigem = enderecoOrigem;
    }

    public void setEnderecoDestino(String enderecoDestino) {
        this.enderecoDestino = enderecoDestino;
    }
}
