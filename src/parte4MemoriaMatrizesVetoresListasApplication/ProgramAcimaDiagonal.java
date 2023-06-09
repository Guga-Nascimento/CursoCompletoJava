package parte4MemoriaMatrizesVetoresListasApplication;
import java.util.Locale;
import java.util.Scanner;
public class ProgramAcimaDiagonal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Ler um inteiro N (máximo = 10) e uma matriz quadrada de ordem N
		contendo números inteiros. Mostrar a soma dos elementos acima da
		diagonal principal. Um exemplo de números acima da diagonal
		principal é mostrado ao lado (no caso as células com fundo cinza).*/
		
		System.out.println("Informe N ");
		int n = sc.nextInt();		
		int[][] mat = new int[n][n];//instanciandp a matriz
		for (int i =0;i<mat.length;i++) {//for de matriz sempre usa 'i','j' para acessar cada posição da matriz
			for(int j = 0;j < mat[i].length;j++) {
				System.out.print("Informe o número que deseja adicionar na matriz: ");
				mat[i][j] = sc.nextInt();				
			}
		}
		for (int i =0;i<mat.length;i++) {
			for(int j = 0;j < mat[i].length;j++) {
				if (i < j) {
					System.out.print("["+mat[i][j]+"]");
			}}}		
		sc.close();
	}
}
