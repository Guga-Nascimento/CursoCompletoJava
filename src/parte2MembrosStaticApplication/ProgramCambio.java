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
