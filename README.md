# CursoCompletoJava
Atualmente, estou dedicando tempo e esforço para aprimorar minhas habilidades em programação através de um curso completo de Java. Nesse curso, estou aprendendo os fundamentos e princípios da programação orientada a objetos (OOP), utilizando a linguagem Java como base.

Comecei do básico, aprendendo a sintaxe do Java, a manipulação de variáveis e as estruturas de controle. Conforme avanço, mergulho em conceitos mais complexos, como classes, objetos, herança, polimorfismo, encapsulamento e abstração.

Além disso, estou sendo apresentado a tópicos avançados, como interfaces, tratamento de exceções, coleções, generics e lambda expressions. Também estou explorando o Spring Boot, um framework popular para o desenvolvimento de aplicativos Java, o que me permite aprender sobre a persistência de dados.

Durante o curso, estou realizando exercícios práticos para aplicar os conceitos aprendidos. Esses exercícios são baseados em problemas do mundo real, o que me ajuda a entender como os conceitos da OOP são aplicados na prática.

Através desse curso, espero adquirir um sólido conhecimento em programação Java e aprofundar minhas habilidades em OOP. Dessa forma, estarei preparado para enfrentar desafios mais complexos no desenvolvimento de software e aplicar meus conhecimentos para criar aplicativos utilizando o Spring Boot.

```java
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
 
```
---

#PARTE 2: Membros estáticos

Nesse exercício sobre membros estáticos, foi evidente a importância da utilização da palavra-chave "static". Essa importação se faz necessária, pois ela permite que os métodos ou atributos possam ser acessados sem a necessidade de se instanciar um objeto. Além disso, foi possível praticar o conceito de criação de constantes utilizando métodos e atributos estáticos.

Outro aspecto abordado foi o uso do método "System.out". Quando esse método é seguido pelo "print", o resultado é exibido em branco no terminal. Por outro lado, ao utilizar "System.err" seguido de "print", o resultado é exibido em vermelho, proporcionando uma forma visual de diferenciar informações importantes ou de erro durante a execução do programa.


```java
package parte2MembrosStaticApplication;

import java.util.Locale;
import java.util.Scanner;
import parte2MembrosStaticEntities.CurrencyConverter;
public class ProgramCambio {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser
           comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos 
           dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor em 
           dólar. Criar uma classe CurrencyConverter para ser responsável pelos cálculos.*/
		
		System.out.println("Qual o Valor do Dolar? ");
		CurrencyConverter.dolar = sc.nextDouble();
		System.out.println("Qual a quantidade de Dólares serão comprados?");
		CurrencyConverter.qtsDolar = sc.nextDouble();		
		System.err.println("Valor a ser pago em reais = "
		+String.format("%.2f",CurrencyConverter.Converte()));		
		sc.close();
	}
}
package parte2MembrosStaticEntities;

public class CurrencyConverter {//Conversor de moeda
	
	public static double dolar;
	public static double qtsDolar;
	public static final double IOF = 0.06;

	public static double Converte() {
		return (((qtsDolar  * dolar) * IOF )+ qtsDolar * dolar);
	}

}
 
```
---
#Parte3 Construtores, this, sobrecarga,encapsulamento

Realizei um exercício com o objetivo de aprofundar minha compreensão sobre a importância do encapsulamento, além de reforçar meus conhecimentos sobre construtores, métodos getters e setters. Nesse exercício, criei uma classe com atributos privados e utilizei construtores para inicializá-los corretamente. Em seguida, implementei métodos getters e setters para acessar e modificar esses atributos de maneira controlada.

Para expandir meu aprendizado, introduzi uma estrutura condicional switch no programa. Essa estrutura me permitiu criar diferentes casos de uso para os métodos getters e setters, o que me ajudou a compreender melhor como essas funções podem ser úteis em diferentes situações.

Esse exercício foi extremamente valioso, pois me permitiu consolidar meu conhecimento sobre encapsulamento e demonstrou a importância de utilizar construtores, getters e setters de forma adequada. Além disso, ao introduzir o switch, pude ampliar minha compreensão sobre estruturas condicionais e como elas podem ser combinadas com os princípios de encapsulamento para criar código mais eficiente e modular.

```java
package parte3ConstrutoresThisSobrecargaEncapsulamentoEntities;

public class Conta {
	
	private String name;
	private Integer numeroConta;
	private double saldo;
	public Conta(String name, Integer numeroConta, double saldo) {
		super();
		this.name = name;
		this.numeroConta = numeroConta;
		deposito(saldo);//importante conceito que protege o programa de mudanças futuras
	}
	public Conta(String name, Integer numeroConta) {
		super();
		this.name = name;
		this.numeroConta = numeroConta;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public String toString() {
		return name
				+ "\nnumeroConta= " + numeroConta 		
				+ "\nsaldo= " + saldo;
	}
	public double deposito(double deposito) {
		return saldo += deposito;
	}
	public double saque(double saque) {
		return saldo -= (saque +  5.00);
	}
	
	}

```
