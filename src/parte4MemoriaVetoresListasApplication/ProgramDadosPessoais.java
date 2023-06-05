package parte4MemoriaVetoresListasApplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramDadosPessoais {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
		 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a
		 * média de altura das mulheres, e o número de homens.
		 */
		System.out.println("Informe N");
		int n = sc.nextInt();// recebendo o número que define o tamanho dos vetores
		double[] altura = new double[n];// Criado os vetores e Variáveis usados no exercicio.
		char[] genero = new char[n];
		double maior = 0, menor = 5.0, media = 0;
		int contadorHomens = 0, contadorMulheres = 0;// '' '' '' ' '' ''''''''''''''' '''''''''''''''''
													
		for (int i = 0; i < altura.length; i++) {// for criado para receber os dados solicitados no exercicio sem
			// tratamento de erros, pois a intenção e exercitar vetores em outro momento tratamos erros:
			System.err.printf("Informe a %d° Altura da pessoa == ", (i + 1));
			altura[i] = sc.nextDouble();
			System.err.printf("Informe o %d° Gênero da pessoa == ", (i + 1));
			genero[i] = sc.next().charAt(0);

		}
		for (int i = 0; i < altura.length; i++) {// for para descobrir maior altura
			if (altura[i] > maior) {
				maior = altura[i];
			}
		}
		for (int i = 0; i < altura.length; i++) {// for para descobrir menor altura
			if (altura[i] < menor) {
				menor = altura[i];
			}
		}
		for (int i = 0; i < altura.length; i++) {// for para descobrir media feminina
			if (genero[i] == 'F') {
				media += altura[i];
				contadorMulheres++;
			}
		}
		media = media / contadorMulheres;// formula para descobrir a media feminina
		for (int i = 0; i < genero.length; i++) {
			if (genero[i] == 'M') {
				contadorHomens++;
			}
		}
		System.out.println("Menor Altura: " + menor);
		System.out.println("Maior Altura:  " + maior);
		System.out.printf("Média das alturas feminina: %.2f\n", media);
		System.out.println("Números de homens: " + contadorHomens);

		
		sc.close();
	}

}
