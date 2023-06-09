package parte4MemoriaMatrizesVetoresListasApplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramNegativosDaMatriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Ler dois números M e N (máximo = 10), e depois ler uma matriz MxN de números inteiros, conforme
		exemplo. Em seguida, mostrar na tela somente os números negativos da matriz.*/
		System.out.println("Qual a quantidade de colunas da matriz?");
		int coluna = sc.nextInt();//recebendo o número de coluna na matriz
		System.out.println("Qual a quantidade de linhas da matriz?");
		int linha = sc.nextInt();//recebendo o número de linhas na matriz			
		int[][] mat = new int[coluna][linha];//declarada a matriz 
		int numero =0 ;
		int x =1;
		
		for(int i=0;i<coluna;i++) {			
			for(int j=0;j<linha;j++) {
				System.out.println("Informe o " +(x++)+"° número");
				mat[i][j] = sc.nextInt();				
			}					
			}
		System.out.println("Números negativos");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {					
			if(mat[i][j] < 0) {
				numero = mat[i][j];
				System.out.println(numero);
			}		
			}
		}
		
		
		sc.close();
	}

}
