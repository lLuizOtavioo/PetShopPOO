
package model;

public class ServicoEstetica extends Servico {

    private String tipoServico;
    private String porteAtendido;
    private boolean usaProdutosEspeciais;

    public ServicoEstetica(
            int id,
            String nome,
            String descricao,
            double preco,
            int duracaoMinutos,
            String tipoServico,
            String porteAtendido,
            boolean usaProdutosEspeciais) {

        super(id, nome, descricao, preco, duracaoMinutos);

        this.tipoServico = tipoServico;
        this.porteAtendido = porteAtendido;
        this.usaProdutosEspeciais = usaProdutosEspeciais;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public String getPorteAtendido() {
        return porteAtendido;
    }

    public boolean isUsaProdutosEspeciais() {
        return usaProdutosEspeciais;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public void setPorteAtendido(String porteAtendido) {
        this.porteAtendido = porteAtendido;
    }

    public void setUsaProdutosEspeciais(boolean usaProdutosEspeciais) {
        this.usaProdutosEspeciais = usaProdutosEspeciais;
    }
}
