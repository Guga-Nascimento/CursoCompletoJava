package parte7HerancaPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import parte7HerancaPolimorfismo.entidades.Empregado;
import parte7HerancaPolimorfismo.entidades.EmpregadoTercerizado;

public class ProgramEmpregado {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Uma empresa possui funcionários próprios e terceirizados. Para cada funcionário, deseja-se registrar nome, horas
trabalhadas e valor por hora. Funcionários terceirizado possuem ainda uma despesa adicional.
O pagamento dos funcionários corresponde ao valor da hora multiplicado pelas horas trabalhadas, sendo que os
funcionários terceirizados ainda recebem um bônus correspondente a 110% de sua despesa adicional.
Fazer um programa para ler os dados de N funcionários (N fornecido pelo usuário) e armazená-los em uma lista. Depois
de ler todos os dados, mostrar nome e pagamento de cada funcionário na mesma ordem em que foram digitados.
Construa o programa conforme projeto ao lado. Veja exemplo na próxima página.*/
		
		System.out.print("Digite o número de funcionários: ");
		int n = sc.nextInt();

		
		List <Empregado> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados do funcionário nº " +(i+1)+" :");
			System.out.print("Terceirizado (s/n)?  ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome:  ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas:  ");
			Integer horas = sc.nextInt();
			System.out.print("Valor Da Hora: ");
			Double valorHora = sc.nextDouble();
			Empregado emp = new Empregado(nome, horas, valorHora);
			if(ch == 's') {
				System.out.print("Valor do Adicional:  ");
				Double adicionalTercerizacao = sc.nextDouble();
				list.add(new EmpregadoTercerizado(nome, horas, valorHora, adicionalTercerizacao));
			}else {
				list.add(new Empregado(nome, horas, valorHora));
			 }
		}	
		
		System.out.println();
		System.err.println("Pagamentos: ");
		
		for(Empregado emp: list) {
			System.out.print(emp.getNome()+" - "+"R$ "+ String.format("%.2f", emp.pagamento()));
			System.out.println();
		}		
		sc.close();
	}

}

/*NESSE PROGRAMA COMEÇA PEDINDO O NÚMERO DE EMPREGADOS QUE SERÃO CADASTRADOS E COMO DE
  COSTUME INICIAMOS A ESTRUTURA DE REPETIÇÃO FOR PARA QUE SEJA GUARDADO OS DADOS DE CADA EMPREGADOS
  NA LISTA CRIADA ANTERIOMENTE COMO PODE SER VISTA NO PROGRAMA.
  
  DENTRO DO 'FOR' CRIAMOS A OPÇÃO EXIGIDA PELO EXERCICIO DE ESCOLHER SE O EMPREGADO É TERCERIZADO OU 
  NÃO, USANDO A ESTRUTURA CONDICIONAL 'IF-ELSE-ELSE IF' CASO O RESULTADO INDIQUE QUE O EMPREGADO SEJA 
  TERCERIZADO, GERAMOS MAIS UMA PERGUNTA SOBRE QUAL É O VALOR DO ADICIONAL E DEPOIS INSTANCIAMOS
  O OBJ NA CLASSE [ EmpregadoTercerizado ] NA QUAL SOBREPOMOS O METODO {pagamento} COM O CALCULO DO 
  ADICIONAL. 
  CASO O EMPREGADO NÃO SEJA TERCERIZADO INSTANCIAMOS ELE NA CLASSE [ Empregado ].
  POR FIM IMPRIMIMOS ATRAVÉZ DO 'FORICH' TODOS OS OBJTS DA LISTA FAZENDO USO TAMBÉM DO STRING.FORMAT.  
 * */
