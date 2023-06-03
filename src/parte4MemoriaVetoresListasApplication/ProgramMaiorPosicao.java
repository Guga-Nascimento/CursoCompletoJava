package parte4MemoriaVetoresListasApplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMaiorPosicao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida, mostrar na tela o maior número do vetor (supor não haver empates).
		 * Mostrar também a posição do maior elemento, considerando a primeira posição
		 * como 0 (zero).
		 */
		System.out.println("Informe N");
		int n = sc.nextInt();
		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Informe o %d° número ", (i + 1));// for para receber os valores e guarda-los no vetor
			vetor[i] = sc.nextInt();
		}

		int maior = 0;
		int posicao = 0;
		for (int i = 0; i < vetor.length; i++) {// para obter o maior valor digitado.
			if (vetor[i] >= maior) {
				maior = vetor[i];
				posicao = (i + 1);
			}
		}
		System.out.println();
		System.out.println("O maior número digitado foi " + maior);
		System.out.printf("O maior número, foi digitado na %d° posição", posicao);

		sc.close();
	}

}
