package parte4MemoriaVetoresListasApplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSomarVetoresAB {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
		   terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
		   o vetor C gerado. */
		
		System.out.println("Informe N");//Entrada do dado N
		int n = sc.nextInt();//criada a variável n que recebe o tamanho de cada vetor
		int[] vetorA = new int[n];//instanciado vetor A
		int[] vetorB= new int [n];//instanciado vetor B
		int[] vetorC= new int [n];//instanciado vetor C
		
	
		for(int i = 0; i < vetorA.length; i ++) {//for que monta o vetor A
			System.out.printf("Informe o %d° número do vetor A", (i+1));
			vetorA[i] = sc.nextInt();		
			}
	
		for(int i = 0; i < vetorB.length; i ++) {//for que monta vetor B
			System.out.printf("Informe o %d° número do vetor B ", (i+1));
			vetorB[i] = sc.nextInt();
			}

		for(int i = 0; i < vetorC.length; i ++) {// for para somar cada dado do vetorA + vetorB	
			vetorC[i] += vetorA[i]+vetorB[i];		
			}
		
		for (int i = 0; i < vetorC.length; i++) {//for para imprimir o resultado na tela
			System.out.println(String.format("   %d    +    %d   ==   %d", vetorA[i],vetorB[i],vetorC[i]));			
		}		
		sc.close();
	}

}


