package parte4MemoriaMatrizesVetoresListasApplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramSomarMatrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas
        cada (M e N máximo = 10). Depois, gerar uma terceira matriz C onde cada elemento desta é a soma
        dos elementos correspondentes das matrizes originais. Imprimir na tela a matriz gerada.*/
		System.out.println("Qual a quantidade de linhas da matriz?");
		int linha = sc.nextInt();//recebendo o número de linhas na matriz	
		System.out.println("Qual a quantidade de colunas da matriz?");
		int coluna = sc.nextInt();//recebendo o número de coluna na matriz				
		int[][] matA = new int[linha][coluna];//declarada a matriz 
		int[][] matB = new int[linha][coluna];
		int[][] matC = new int[linha][coluna];
		int x =1;
		
		System.out.println("Digite a Matriz A ");
		for(int i=0;i<matA.length;i++) {	
			System.out.println(matA[i].length);
			System.out.println(x+"° Linha");
			x++;
			for(int j=0;j<matA[i].length;j++) {
				matA[i][j] = sc.nextInt();							
			}}
		System.out.println("Digite a Matriz B");
		x=1;
		for(int i=0;i<matB.length;i++) {			
			System.out.println(x+"° Linha");
			x++;
			for(int j=0;j<matB[i].length;j++) {
				matB[i][j] = sc.nextInt();							
			}}
		
		for(int i=0;i<matC.length;i++) {			
			
			for(int j=0;j<matA[i].length;j++) {
				matC[i][j] = matA[i][j]		+ matB[i][j];
				System.out.print(matC[i][j]+" ");	
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
