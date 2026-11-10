
package model;

import java.time.LocalDateTime;

public class Atendimento {

    private int id;
    private LocalDateTime dataHora;
    private String descricao;
    private String tipo;
    private String canal;
    private String status;
    private Cliente cliente;
    private Funcionario funcionario;

    public Atendimento(int id, LocalDateTime dataHora, String descricao,
                       String tipo, String canal, String status,
                       Cliente cliente, Funcionario funcionario) {

        this.id = id;
        this.dataHora = dataHora;
        this.descricao = descricao;
        this.tipo = tipo;
        this.canal = canal;
        this.status = status;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }


    public void registrarAtendimento() {
        System.out.println("Atendimento registrado!");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Funcionário responsável: " + funcionario.getNome());
        System.out.println("Tipo: " + tipo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Canal: " + canal);
        System.out.println("Status: " + status);
    }

    public void finalizarAtendimento() {
        status = "Finalizado";
        System.out.println("Atendimento finalizado!");
    }

    public String consultarStatus() {
        System.out.println("Status: " + status);
        return status;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCanal() {
        return canal;
    }

    public String getStatus() {
        return status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
