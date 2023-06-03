package parte4MemoriaVetoresListasApplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMaisVelho {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
         devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
         da pessoa mais velha. */
		System.out.println("Informe N");
		int n = sc.nextInt();//recebendo o número que define o tamanho dos vetores
		String[] nomes = new String[n];//criado vetor nomes
		int[] idade = new int[n];//criado vetor idade		
		for (int i = 0; i < n; i++) {//for criado para receber os dados de cada pessoa
			System.out.printf("Informe o %d° nome ", (i + 1));// for para receber os valores e guarda-los no vetor
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.printf("Informe a %d° idade ", (i + 1));
			idade[i] = sc.nextInt();			
		}		
		int maiorIdade = 0;//criado variável para guardar o numero da pessoa mais velha
		String recebeNome = null;
		for (int i = 0; i < n; i++) {
			if (maiorIdade < idade[i]) {
				maiorIdade = idade[i];
				recebeNome = nomes[i];				
			}		
		}
		System.out.println(recebeNome + " com "+ maiorIdade+ " é o mais velho");			
		sc.close();
	}

}
