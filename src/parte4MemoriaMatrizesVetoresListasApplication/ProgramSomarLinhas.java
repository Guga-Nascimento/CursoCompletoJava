package parte4MemoriaMatrizesVetoresListasApplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSomarLinhas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Fazer um programa para ler dois números inteiros M e N (máximo = 10). Em seguida, ler uma matriz
de M linhas e N colunas contendo números reais. Gerar um vetor de modo que cada elemento do vetor
seja a soma dos elementos da linha correspondente da matriz. Mostrar o vetor gerado.*/
		System.out.println("Qual a quantidade de colunas da matriz?");		
		int coluna = sc.nextInt();//recebendo o número de coluna na matriz
		System.out.println("Qual a quantidade de linhas da matriz?");
		int linha = sc.nextInt();//recebendo o número de linhas na matriz			
		int[][] mat = new int[linha][coluna];//declarada a matriz 
		int [] vetor = new int[coluna];//declarado o vetor		
		System.out.println("Digite os elementos da 1a. linha: ");/*SE FOSSE COLOCADO DENTRO DO FOR, SEGUIDO DO
		i +1 FICARIA ATÉ MELHOR ASSIM    
		for(int i=0;i<mat.length;i++) {	
				System.out.println("Digite os elementos da (i+1)°. linha: ");			
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();		
			}	PORÉM PRECISAVA APRENDER COMO FAZER UM SYSO APARECER EM TODOS OS LOOPS MENOS NO ULTIMO	
		}*/
		for(int i=0;i<mat.length;i++) {
			System.out.println(mat.length);//qts linha
			System.out.println(mat[i].length);//qts coluna
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();			
		}if( (i + 1) == mat.length ) {	//estrutura condicional para que nao imprima syso no ultimo loop				
		}else {
			System.out.println("Digite os elementos da proxima linha:");
		}				
		}		
		int soma = 0;
		for(int i=0;i<mat.length;i++) {	//for para guardar o valor da soma de cada linha no vetor		
			soma=0; //reiciando a variável soma para que ela nao de o resultado da 1linha com a 2 linha
		for(int j=0;j<mat[i].length;j++) {//for para obter o valor da soma de cada linha	
			soma += mat[i][j];
		}
		    vetor[i] = soma;//vetor recebe na posição i a soma da linha da matriz
		}
		System.out.println("VETOR GERADO:");//chamada do print
		for(int i=0;i<mat.length;i++) {//for para exibir o vetor com a soma das linhas como o pedido no exercicio
			System.out.println(vetor[i]);
		}	
		
		sc.close();
		
	}

}
