package parte4MemoriaVetoresListasApplication;

import java.util.Locale; 
import java.util.Scanner;

import parte4MemoriaVetoresListasEntities.Ultilidades;

public class ProgramNegativos {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Faça um programa que leia um número inteiro positivo N
		 * (máximo = 10) e depois N números inteiros e armazene-os
		 * em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/
		System.out.println("Informe N");
		int n = sc.nextInt();
		int [] vetor = new int [n];		
		
	for(int i = 0; i < vetor.length; i ++) {
		System.out.printf("Informe o %d° número ", (i+1));
		vetor[i] = sc.nextInt();
		}//recebido todos os dados necessarios de cada n;	
		int soma = 0;
		for (int i = 0; i < vetor.length; i ++) {			
			soma = Ultilidades.soma(vetor[i]);	//soma recebe cada dado n		
			if(i == n - n) {
				System.out.println("Números Negativos : ");				
			}
			if(soma < 0 ) {//verifica se é negativo
				System.out.println(Ultilidades.soma(soma));//imprime caso seja negativo			
	  	}	
			}			
			
		
		sc.close();
	}
}
