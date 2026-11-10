
import model.*;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {


        Cliente cliente = new Cliente(1, "João Silva", "84999999999");


        Pet pet = new Pet(1, "Rex", "Cachorro");
        cliente.cadastrarPet(pet);


        Vendedor vendedor = new Vendedor(
                1,
                "Carlos",
                "Vendedor",
                3,
                "Administração"
        );


        Atendimento atendimento = new Atendimento(
                1,
                LocalDateTime.now(),
                "Dúvida sobre os produtos da loja",
                "Dúvida",
                "Presencial",
                "Aberto",
                cliente,
                vendedor
        );

        cliente.adicionarAtendimento(atendimento);


        Produto racao = new Produto(
                1,
                "Ração Premium",
                "Ração para cães adultos",
                120.00,
                "Alimentação",
                20
        );


        ServicoEstetica banho = new ServicoEstetica(
                2,
                "Banho",
                "Banho completo para cães",
                50.00,
                60,
                "Banho",
                "Pequeno",
                true
        );


        Pedido pedido = new Pedido(
                1,
                LocalDateTime.now(),
                "Aberto",
                cliente
        );


        ItemPedido item1 = new ItemPedido(racao, 2, racao.getPreco());
        ItemPedido item2 = new ItemPedido(banho, 1, banho.getPreco());

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        cliente.adicionarPedido(pedido);


        double total = pedido.calcularTotal();


        Pagamento pagamento = new Pagamento(
                total,
                "Pix",
                "Pendente"
        );

        pedido.setPagamento(pagamento);


        pagamento.confirmar();


        System.out.println("\n===== PET SHOP =====");

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());

        System.out.println("\nPet: " + pet.getNome());
        System.out.println("Espécie: " + pet.getEspecie());

        System.out.println("\nFuncionário: " + vendedor.getNome());

        System.out.println("\nAtendimento:");
        atendimento.registrarAtendimento();

        System.out.println("\nPedido:");
        System.out.println("Produto: " + racao.getNome());
        System.out.println("Serviço: " + banho.getNome());
        System.out.println("Total: R$ " + total);

        System.out.println("\nPagamento:");
        System.out.println("Forma: " + pagamento.getForma());
        System.out.println("Status: " + pagamento.consultarStatus());

        System.out.println("\nQuantidade de pets: " + cliente.getPets().size());
        System.out.println("Quantidade de pedidos: " + cliente.getPedidos().size());
        System.out.println("Quantidade de atendimentos: " + cliente.getAtendimentos().size());
    }
}
