package parte4MemoriaVetoresListasApplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramComerciante {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele
		 * comercializa. Para isto, mandou digitar um conjunto de N mercadorias, cada
		 * uma contendo nome, preço de compra e preço de venda das mesmas. Fazer um
		 * programa que leia tais dados e determine e escreva quantas mercadorias
		 * proporcionaram: lucro < 10% 10% ≤ lucro ≤ 20% lucro > 20% Determine e escreva
		 * também o valor total de compra e de venda de todas as mercadorias, assim como
		 * o lucro total.
		 */
		System.out.println("Informe N");
		int n = sc.nextInt();// recebendo o número que define o tamanho dos vetores
		String[] nome = new String[n];// Criado os vetores e Variáveis usados no exercicio.
		double[] precoCompra = new double[n];
		double[] precoVenda = new double[n];
		int menosDe10 = 0, entre10e20 = 0, maiorQue20 = 0;
		double valorCompra = 0.0, valorVenda = 0.0;// '''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

		for (int i = 0; i < nome.length; i++) {// for para receber os dados do exercicio
			sc.nextLine();
			System.out.printf("Informe o %d° Nome do Produto == ", (i + 1));
			nome[i] = sc.nextLine();
			System.out.println("Informe o preço de Compra do " + (i + 1) + "° Produto");
			precoCompra[i] = sc.nextDouble();
			System.out.println("Informe o preço de venda do " + (i + 1) + "° Produto");
			precoVenda[i] = sc.nextDouble();

		}
		for (int i = 0; i < nome.length; i++) {
			/*
			 * For com estrutura condicional if para descobrir em qual percentual o dados
			 * recebidos se encaixam, conforme o solicitado pelo exercicio
			 */
			if (precoVenda[i] < precoCompra[i] + (precoCompra[i] * 0.10)) {
				menosDe10++;
			} else if (precoVenda[i] >= precoCompra[i] + (precoCompra[i] * 0.10)
					&&     precoVenda[i] <= precoCompra[i] + (precoCompra[i] * 0.20)) {
				entre10e20++;
			} else if(precoVenda[i] > (precoCompra[i] + (precoCompra[i] * 0.20))) {
				maiorQue20++;
			}
		}
		for (int i = 0; i < nome.length; i++) {// for para somar o total de compras e o total de vendas
			valorCompra += precoCompra[i];
			valorVenda += precoVenda[i];
		}
		double lucro = valorVenda - valorCompra;
		/*
		 * RELATORIO: Lucro abaixo de 10%: 1 Lucro entre 10% e 20%: 2 Lucro acima de
		 * 20%: 1 Valor total de compra: 30.00 Valor total de venda: 33.50 Lucro total:
		 * 3.50
		 */
		System.out.printf("        RELATORIO\n Lucro abaixo de 10%%: %d\n"
				+ " Lucro entre 10%% e 20%%: %d\n"
				+ " Lucro acima de 20%%: %d\n"
				+ " Valor total de compra: %.2f\n"
				+ " Valor total de Venda: %.2f\n"
				+ " Lucro total %.2f\n",menosDe10, entre10e20, maiorQue20, valorCompra, valorVenda, lucro);    

			
		sc.close();
		
	}

}
