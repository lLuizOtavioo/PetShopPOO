
package model;

public class AtendimentoVeterinario extends Servico {

    private String nomeVeterinario;
    private String especialidade;
    private String crmv;

    public AtendimentoVeterinario(
            int id,
            String nome,
            String descricao,
            double preco,
            int duracaoMinutos,
            String nomeVeterinario,
            String especialidade,
            String crmv) {

        super(id, nome, descricao, preco, duracaoMinutos);

        this.nomeVeterinario = nomeVeterinario;
        this.especialidade = especialidade;
        this.crmv = crmv;
    }


    public String getNomeVeterinario() {
        return nomeVeterinario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getCrmv() {
        return crmv;
    }


    public void setNomeVeterinario(String nomeVeterinario) {
        this.nomeVeterinario = nomeVeterinario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }
}
