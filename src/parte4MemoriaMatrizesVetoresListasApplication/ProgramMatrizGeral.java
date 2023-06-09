package parte4MemoriaMatrizesVetoresListasApplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMatrizGeral {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		/*Ler uma matriz quadrada de ordem N (máximo = 10), contendo números reais. Em seguida, fazer as
		seguintes ações:
		a) calcular e imprimir a soma de todos os elementos positivos da matriz.
		b) fazer a leitura do índice de uma linha da matriz e, daí aí, imprimir todos os elementos desta coluna.
		d) imprimir os elementos da diagonal principal da matriz.
		e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir
		a matriz alterada.*/
		System.out.println("Informe N ");
		int n = sc.nextInt();		
		int[][] mat = new int[n][n];
		int[][] mat1 = new int[n][n];
		int somarPositivo = 0;
		int[] imprimirLinha = new int [n];
		int[] imprimirColuna = new int [n];
		for (int i =0;i<mat.length;i++) {
			for(int j = 0;j < mat[i].length;j++) {
				System.out.print("Informe o número que deseja adicionar na matriz: ");
				mat[i][j] = sc.nextInt();				
			}
		}
		for (int i =0;i<mat.length;i++) {
			for(int j = 0;j < mat[i].length;j++) {
				if(mat[i][j] >= 0) {
				somarPositivo += mat[i][j];
				}}
		}System.out.println("Informe a linha que deseja obter a impressão:");
		int linha = sc.nextInt();					
			for(int j = 0;j < mat.length;j++) {
				imprimirLinha[j] = mat [linha][j];	
		}
			
		System.out.println("Informe a coluna que deseja obter a impressão:");
		int coluna = sc.nextInt();		
		for (int i =0;i<mat.length;i++) {
				imprimirColuna[i] = mat [i][coluna];					
		}		
		
		for (int i =0;i<mat.length;i++) {
			for(int j = 0;j < mat[i].length;j++) {
				
			}
		}
		for(int i = 0; i < mat.length;i++ ) {
			for (int j =0; j <mat[i].length; j++) {
				mat1[i][j] += mat[i][j];
				if(mat[i][j] < 0) {
					mat1[i][j] = mat[i][j] * mat[i][j];
				}				
			}
		}
		System.out.println("a) calcular e imprimir a soma de todos os elementos positivos da matriz.");
		System.out.println("A soma de todos os positivos é  "+somarPositivo);
		System.out.println("\n-------------------------------------------------------------------------------------------------");
		
		System.out.println("b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.");
		System.out.printf("Linha %d com os valores: \n",linha);
		for (int i=0; i < imprimirLinha.length;i++) {
			System.out.print("[" + imprimirLinha[i] +"]");			
		}
		System.out.println("\n-------------------------------------------------------------------------------------------------");
		
		System.out.println("c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.");
		System.out.printf("Coluna %d com os valores: \n",linha);
		for (int i=0; i < imprimirColuna.length;i++) {
			System.out.print("["+imprimirColuna[i]+"]");
		}
		
		System.out.println("\n-------------------------------------------------------------------------------------------------");
		System.out.println("d) imprimir os elementos da diagonal principal da matriz.");
		System.out.println("Diaginal Principal");
		for(int i =0; i < mat.length;i++) {			
			System.out.print(" ["+mat[i][i] + "] ");
		}
		
		System.out.println("\n-------------------------------------------------------------------------------------------------");
		System.out.println("e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir\n"
				+ "		a matriz alterada");
		for(int i = 0; i < mat.length;i++ ) {
			for (int j =0; j <mat[i].length;j++) {
				System.out.print("["+mat1[i][j]+"]");				
			}System.out.println();}
		
		sc.close();
	}

}
