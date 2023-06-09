package parte4MemoriaListasApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import parte4MemoriaVetoresListasEntities.Employee;

public class ProgramExercicioList {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();//criada a lista
		
		System.out.print("Quantos funcionários serão digitados? "); // recebendo N
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {//for criado para entrada de dados do funcionário
			System.out.println();
			System.out.println("Funcionário #" + i + ": ");//print do titulo

			System.out.print("Id: ");
			int id = sc.nextInt();//recebendo o id do funcionário
			while (hasId(list, id)) {//estrutura condicional para saber se tem id repetido "hasId"
				System.out.print("Id já cadastrado. Tente novamente: ");//print caso o id seja repetido
				id = sc.nextInt();//solicita a entrada de novo id sem ser repetido
			}			
			System.out.print("Nome: ");
			sc.nextLine();//limpa o espaço deixado pelo nextInt
			String name = sc.nextLine();//recebe o nome do funcionário
			System.out.print("Salary: ");
			double salary = sc.nextDouble();//RECEBE O SALARIO DO FUNCIONÁRIO
			list.add(new Employee(id, name, salary));//LISTA ADICIONA NOVO FUNCIONÁRIO COM OS ARGUMENTOS
													//ID,NAME,SALARY
		}		
		System.out.println();
		System.out.print("Informe o ID do funcionário que terá aumento salarial: ");
		int id = sc.nextInt();//RECEBE O ID DO FUNCIONÁRIO QUE RECEBERA O METODO DE AUMENTO DE SALARIO
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {//ESTRUTURA CONDICIONAL PARA SABER SE ID PERTENCE A ALGUM FUNCIONÁRIO:
			System.out.println("Este id não existe!");
		}
		else {//SENDO O ID VÁLIDADO ANTERIOMENTE RECEBE A PORCENTAGEM DE AUMENTO QUE SERÁ APLICADA
			System.out.print("Digite a porcentagem: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);//CHAMADA DO METODO
		}		
		System.out.println();
		System.out.println("Lista de funcionários:");
		for (Employee obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); 
	}
	
	public static boolean hasId(List<Employee> list, int id) {//FUNCÃO CRIADA PARA RETORNAR SE EXISTE O ID
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
