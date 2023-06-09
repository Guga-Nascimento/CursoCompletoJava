package parte4MemoriaMatrizesVetoresListasApplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramCadaLinha {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Ler um inteiro N e uma matriz quadrada de ordem N (máximo = 10). Mostrar qual o maior elemento
		de cada linha. Suponha não haver empates.*/
		System.out.println("Informe N ");
		int n = sc.nextInt();		
		int[][] mat = new int[n][n];//instanciandp a matriz
		int soma =0;
		int x = 1;
		
		for(int i=0;i<mat.length;i++) {			
			System.out.println(x+"° Linha");
			x++;
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();							
			}			
			}
		for (int i =0; i<mat.length;i++) {
			soma = 0;
			
			for(int j =0;j<mat[i].length;j++) {
				if (mat[i][j] > soma) {
					soma = mat[i][j];
					
				}
			}
			System.out.println("Maior da "+ (i+1)+"° Linha: "+soma);
		}
		
		
		
		
		
		
		
		
		sc.close();
	}

}
