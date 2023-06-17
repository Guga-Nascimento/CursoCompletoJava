package parte7HerancaPolimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import parte7HerancaPolimorfismo.entidades.Empregado;
import parte7HerancaPolimorfismo.entidades.ProdutoImportado;
import parte7HerancaPolimorfismo.entidades.ProdutoNacional;
import parte7HerancaPolimorfismo.entidades.ProdutoUsado;



public class ProgramLoja {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
		/*Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final,
mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.
Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e
produtos usados possuem data de fabricação. Estes dados específicos devem ser
acrescentados na etiqueta de preço conforme exemplo (próxima página). Para produtos
importados, a taxa e alfândega deve ser acrescentada ao preço final do produto.
Favor implementar o programa conforme projeto ao lado.*/
		

		System.out.print("Digite o número de produtos: ");
		int n = sc.nextInt();

		
		List <ProdutoNacional> listaProdutos = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados do produto nº " +(i+1)+" :");
			System.out.print("Nacional,Importado ou Usado (n/i/u)");
			char ch = sc.next().charAt(0);
			System.out.print("Nome:  ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();
			ProdutoNacional produto = new ProdutoNacional(nome, preco);
			if (ch == 'n') {				
				listaProdutos.add(produto);				
			}else if (ch == 'i') {
				System.out.print("Qual o valor da Taxa? ");
				Double taxa = sc.nextDouble();
				listaProdutos.add(new ProdutoImportado(nome, preco, taxa));
			}else if(ch == 'u') {
				System.out.print("Informe a data de fabricaçao: ");
				Date dataFabricacao = sdt.parse(sc.next());
				listaProdutos.add(new ProdutoUsado(nome, preco, dataFabricacao));
			}
			
		}
		System.out.println();
		System.err.println("Etiqueta de Preços: ");
		for(ProdutoNacional produto : listaProdutos) {
			produto.etiquetaPreco();
			System.out.println();
		}			
		sc.close();
	}
}
/*NESSE EXERCICIO DE FIXAÇÃO CRIEI UMA CLASSE MAIN E 3 CLASSE CHAMADAS {	ProdutoNacional,
 ProdutoImportado e ProdutoUsado }.
 ProdutoImportado e ProdutoUsado HERDA A CLASSE ProdutoNacional QUE CONTEM OS ATRIBUTOS
 NOME E PREÇO, TODAS ELAS TEM O METODO [etiquetaPrecos] E COM O USO DA SOBREPOSIÇÃO
 @Override CADA UM IMPRIME SUAS PARTICULARIEDADES.
 
 PRODUTO IMPORTADO RECEBE UM ACRESCIMO DE TAXA DE IMPORTAÇÃO
 
 PRODUTO USADO RECEBE A DATA DE FABRICAÇÃO
 
 PRODUTO NACIONAL COMO CLASSE MÃE IMPRIME NOME E PREÇO 
 
 ASSIM PODEMOS DIZER QUE USAMOS OS CONCEITOS DE ENCAPSULAMENTO UMA VEZ QUE TODOS OS
 ATRIBUTOS FORAM CRIADOS DO TIPO PRIVATE, HERANÇA UMA VEZ QUA AS CLASSE IMPORTADOS E 
 USADOS HERDAM OS ATRIBUTOS NOME E PREÇO DA CLASSE NACIONAL E POR FIM POLIMORFISMO
 QUE POR SUA VEZ PODE SER INDENTIFICADO NO METODO etiquetaPrecos ONDE CADA OBJETO
 INSTANCIADO EM SUA DEVIDA CLASSE IMPRIMI UMA MENSAGEM DIFERENTE. */
 