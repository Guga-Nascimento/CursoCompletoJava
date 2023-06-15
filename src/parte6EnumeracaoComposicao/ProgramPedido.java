package parte6EnumeracaoComposicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import parte6EnumeracaoComposicaoEntities.Cliente;
import parte6EnumeracaoComposicaoEntities.ItemDoPedido;
import parte6EnumeracaoComposicaoEntities.Pedido;
import parte6EnumeracaoComposicaoEntities.Produto;
import parte6EnumeracaoComposicaoEntities.enums.StatusPedido;

public class ProgramPedido {
	/*Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
    sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
    o instante do sistema: new Date()*/

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);//locale para padronizar o separador decimal como .
		Scanner sc = new Scanner(System.in);//Classe Scanner para receber dados
		SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
								
		System.out.println("informe o nome ");
		String nomeCliente = sc.nextLine();
		System.out.println("informe o email ");
		String emailCliente = sc.nextLine();
		System.out.println("Informe data de nascimento");
		Date dataDeNascimento = sdt.parse(sc.next());
		Cliente cliente = new Cliente(nomeCliente, emailCliente, dataDeNascimento);


		System.out.println("Informe o status do pedido");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.println("Informe quantos itens o pedido vai ter?");
		int n = sc.nextInt();		
		for (int i =0; i < n;i ++) {
			System.out.println("Entre com o "+ (i+1) + "Item");
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.println("Preço do produto");
			double precoProduto =sc.nextDouble();
			System.out.println("Quantidade: ");
			int quantidade = sc.nextInt();
		Produto produto = new Produto(nomeProduto, precoProduto);
		ItemDoPedido item = new ItemDoPedido(quantidade,precoProduto, produto);
		
		pedido.addItem(item);
		
		}
		
		System.out.println();
		System.out.println(pedido);
		sc.close();
	}

}
