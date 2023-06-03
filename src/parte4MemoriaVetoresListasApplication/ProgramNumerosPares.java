package parte4MemoriaVetoresListasApplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramNumerosPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        tela todos os números pares, e também a quantidade de números pares.*/

		System.out.println("Informe N");
		int n = sc.nextInt();
		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Informe o %d° número ", (i + 1));// for para receber os valores e guarda-los no vetor
			vetor[i] = sc.nextInt();
		}
		int qtsPares= 0;
		for (int i = 0; i < n; i++) {//for para obter quantos elementos são pares
			if (vetor[i] % 2 == 0) {
					qtsPares++;
			}
		}
		System.out.println("Esses são os números pares:");//syso antes do for para que apareça apenas uma vez
		for (int i = 0; i<vetor.length;i++) {//for para imprimir os pares
			if(vetor[i] % 2 == 0) {
				System.out.print(" ["+vetor[i]+"] ");				
			}
			
		}
		System.out.println();
		System.out.println("Quantidade de pares: "+  qtsPares);		
		sc.close();
	}

}
