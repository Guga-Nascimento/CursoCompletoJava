package parte4MemoriaMatrizesVetoresListasApplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramDiagonalNegativos {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Fazer um programa para ler um número inteiro N (máximo = 10) e uma matriz quadrada de ordem N
		contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores
		negativos da matriz.*/
		System.out.println("Informe N ");
		int n = sc.nextInt();		
		int[][] mat = new int[n][n];//instanciandp a matriz
		
		for (int i =0;i<mat.length;i++) {//for de matriz sempre usa 'i','j' para acessar cada posição da matriz
			for(int j = 0;j < mat[i].length;j++) {
				System.out.print("Informe o número que deseja adicionar na matriz: ");
				mat[i][j] = sc.nextInt();				
			}
		}
		int contador = 0;
	
		for(int i =0;i<mat.length;i++) {//for para saber qts números são negativos
			for(int j = 0;j < mat[i].length;j++) {
			if ( mat[i][j]< 0) {
				contador++;
			}
			}
		}
		System.out.println("Diagonal Principal:");
		for(int i =0; i < mat.length;i++) {//for para descobrir a diagonal principal que sempre cairá nas posições repetidas
			// 00-11-22
			System.out.print(" "+mat[i][i] + " ");
		}
		System.out.println();
		System.err.printf(" %d números negativos \n",contador);	
		
		
		
		sc.close();
	}

}
