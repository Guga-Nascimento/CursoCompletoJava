package parte4MemoriaVetoresListasApplication;

import java.util.Locale; 
import java.util.Scanner;

import parte4MemoriaVetoresListasEntities.Ultilidades;

public class ProgramSomaVetor {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
		- Imprimir todos os elementos do vetor
		- Mostrar na tela a soma e a média dos elementos do vetor.*/
		System.out.println("Informe N");
		int n = sc.nextInt();
		int [] vetor = new int [n];		
		
	for(int i = 0; i < vetor.length; i ++) {
		System.out.printf("Informe o %d° número ", (i+1));//for para receber os valores e guarda-los no vetor
		vetor[i] = sc.nextInt();	
	}
	int soma = 0;
	double media = 0;
	
	for (int i = 0; i < vetor.length; i++) {//for para gerar soma.
		soma += vetor[i];
	}
	
	media = soma / vetor.length;
	System.out.println();
	System.out.print("VALORES : ");
	for(int i = 0; i <vetor.length; i++) {//for para imprimir na tela os valores recebidos no primeiro for
		System.out.print("["+vetor[i]+"] ");	
	}
	System.out.println();
	System.out.println("SOMA: "+Ultilidades.soma(soma));
	System.out.println("MÉDIA: "+Ultilidades.media(media, soma, n));	
	sc.close();
	}
}
