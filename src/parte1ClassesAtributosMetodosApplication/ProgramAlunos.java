package parte1ClassesAtributosMetodosApplication;

import java.util.Locale;
import java.util.Scanner;

import parte1ClassesAtributosMetodosEntities.Alunos;

public class ProgramAlunos {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três
	trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada).
    Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado
    (APROVADO) ou não (REPROVADO) e, em caso negativo, quantos pontos faltam para o
     aluno obter o mínimo para ser aprovado (que é 60% da nota). 
     Você deve criar uma classe Student para resolver este problema.*/
	Scanner sc = new Scanner(System.in);	
	Alunos aluno = new Alunos();
	
	System.out.println("Informe o Nome do Aluno: ");
	aluno.name = sc.nextLine();
	System.out.println("Informe a nota do primeiro Trimestre: ");
	aluno.nota1 = sc.nextDouble();
	System.out.println("Informe a nota do segundo Trimestre: ");
	aluno.nota2 = sc.nextDouble();
	System.out.println("Informe a nota do terceiro Trimestre: ");
	aluno.nota3 = sc.nextDouble();
	
	System.out.printf("NOTA FINAL: %.2f\n", aluno.mediaFinal());
	
	if (aluno.mediaFinal() < 60) {
		System.out.println("****************REPROVADO*********************");
		System.out.println
		(String.format("FALTARAM %.2f PONTOS PARA APROVAÇÂO", aluno.pontosQueFaltaram()));
	}else {
		System.out.println("APROVADO");
	}
	
	
	
	sc.close();

	}

}
