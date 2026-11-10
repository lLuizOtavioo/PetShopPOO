
package model;

import java.util.ArrayList;

public class Cliente {

    private int id;
    private String nome;
    private String telefone;
    private ArrayList<Pet> pets;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Atendimento> atendimentos;

    public Cliente(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.pets = new ArrayList<>();
        this.pedidos = new ArrayList<>();
        this.atendimentos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public ArrayList<Atendimento> getAtendimentos() {
        return atendimentos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void cadastrarPet(Pet pet) {
        pets.add(pet);
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        atendimentos.add(atendimento);
    }
}
