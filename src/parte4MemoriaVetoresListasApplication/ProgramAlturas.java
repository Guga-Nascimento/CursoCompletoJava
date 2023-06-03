package parte4MemoriaVetoresListasApplication;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAlturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
		 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 */

		System.out.println("Informe N");
		int n = sc.nextInt();//recebendo o número que define o tamanho dos vetores

		String[] nomes = new String[n];//criado vetor nomes
		int[] idade = new int[n];//criado vetor idade
		double[] alturas = new double[n];//criado vetor alturas

		for (int i = 0; i < n; i++) {//for criado para receber os dados de cada pessoa
			System.out.printf("Informe o %d° nome ", (i + 1));// for para receber os valores e guarda-los no vetor
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.printf("Informe a %d° idade ", (i + 1));
			idade[i] = sc.nextInt();
			System.out.printf("Informe a %d° altura ", (i + 1));
			alturas[i] = sc.nextDouble();
		}
		double nmenores = 0;//criado variável para guardar o numero de pessoas com menos de 16 anos
		double total = 0;//criado a variável para dividir por alturas.length para chegarmos a média de alturas
		for (int i = 0; i < n; i++) {//for criado para somar qts pessoas tem menos de 16
			if (idade[i] < 16) {
				nmenores++;
			}
			total +=  + alturas[i];//dentro desse mesmo for guardamos as alturas recebidas na posição i na variavel total
		}
		double media = total / alturas.length;//criada a variavel media com a formula para obter a média
		double percentualMenores = (nmenores / idade.length) * 100.0;//formula para obter percentual de 
		//pessoas com menos de 16
		System.out.printf("\nAltura media = %.2f\n", media);//syso para imprimir a media
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);//syso para imprimir percentual
		for (int i = 0; i < idade.length; i++) {//for para imprimir nome de pessoas com menos de 16
			if (idade[i] < 16) {
				System.out.printf("%s\n", nomes[i]);
			}
		}
		sc.close();
	}

}
