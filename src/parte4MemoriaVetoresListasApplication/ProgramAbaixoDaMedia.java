package parte4MemoriaVetoresListasApplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAbaixoDaMedia {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. */
		
		System.out.println("Informe N");//Entrada do dado N
		int n = sc.nextInt();//criada a variável n que recebe o tamanho de cada vetor
		double[ ] vetor = new double[n];//instanciado vetor A
		double soma = 0;
		double media = 0;
		for(int i = 0; i < vetor.length; i ++) {//for que monta o vetor A
			System.out.printf("Informe o %d° número", (i+1));
			vetor[i] = sc.nextDouble();
			soma+= vetor[i];
			}	
		media = soma / n; // operação para obter a media
		
		System.out.println(String.format("A média solicitada do vetor é = %.3f",media));
		
		System.out.println("Esses elementos ficaram abaixo da média: ");
		for(int i = 0; i < vetor.length; i ++) {//for que monta vetor B			
			if(vetor[i]< media) {
			System.out.println(vetor[i]);
			}
			}
		sc.close();
	}

}
