package parte4MemoriaVetoresListasApplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAprovados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
		 * notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve
		 * ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
		 * considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0
		 * (seis).
		 */

		System.out.println("Informe N");
		int n = sc.nextInt();// recebendo o número que define o tamanho dos vetores
		String[] nomes = new String[n]; //vetor nomes para guardar os nomes 
		double[] notaPrimeiroSemestre = new double[n];//veotr para guardar as notas 
		double[] notaSegundoSemestre = new double[n];// "       "           ''           ''     

	
		for (int i = 0; i < nomes.length; i++) {//for para receber dados solicitados no exercicio
			System.err.println("Informe o nome do aluno: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.println("Informe a nota do Primeiro Semestre: ");
			notaPrimeiroSemestre[i] = sc.nextDouble();
			System.out.println("Informe a nota do Segundo Semestre: ");
			notaSegundoSemestre[i] = sc.nextDouble();

		}
		for (int i = 0; i < notaPrimeiroSemestre.length; i++) {//for para imprimir o resultado solicitado no exercicio			
			if ((notaPrimeiroSemestre[i] + notaSegundoSemestre[i]) / 2 >= 6.00) {			
				System.out.println(String.format(
					" Nome: %s\n"
				+ " Primeiro Semestre: %.2f \n" 
				+ " Segundo Semestre: %.2f\n" 
				+ " APROVADO:",
					nomes[i],notaPrimeiroSemestre[i], notaSegundoSemestre[i]));
				System.out.println();
			}
		}

		sc.close();
	}

}
