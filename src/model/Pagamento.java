package model;

public class Pagamento {
    private double valor;
    private String forma;
    private String status;


    public Pagamento(double valor, String forma, String status){
        this.valor = valor;
        this.forma = forma;
        this.status = status;
    }

    public double getValor() {
        return valor;
    }

    public String getForma() {
        return forma;
    }

    public String getStatus() {
        return status;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public void confirmar() {
        status = "Confirmado";
        System.out.println("Pagamento confirmado!");
    }

    public String consultarStatus() {
        return status;
    }

}
