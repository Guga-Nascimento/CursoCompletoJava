package parte1ClassesAtributosMetodosApplication;

import java.util.Locale;
import java.util.Scanner;

import parte1ClassesAtributosMetodosEntities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto, e imposto).
		 Em seguida, mostrar os dados do funcionário (nome e salário liquido).
		 Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente 
		 o saalário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use 
		 a classe projetada no PDF.*/
		
		Employee funcionario01 = new Employee();
		
		System.out.println("Informe o nome: ");
		funcionario01.nome = sc.nextLine();
		System.out.println("Informe o Salário Bruto");
		funcionario01.grossSalary = sc.nextDouble();
		System.out.println("Informe o imposto a ser deduzido");
		funcionario01.tax = sc.nextDouble();
		
		System.out.println("Salário liquido: "+String.format("%.2f%n", funcionario01.netSalary()));
		
		System.out.println("Informe porcentagem de aumento:");
		double percentage = sc.nextDouble();
		funcionario01.increaseSalary(percentage);
		
		System.out.println(funcionario01.netSalary());
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
