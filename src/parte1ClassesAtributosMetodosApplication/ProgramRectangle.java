package parte1ClassesAtributosMetodosApplication;


import java.util.Locale;
import java.util.Scanner;

import parte1ClassesAtributosMetodosEntities.Rectangle;

public class ProgramRectangle {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida,
		 mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma classe como 
		 mostrado no pdf*/
	
		 Rectangle retangulo = new Rectangle();
		 
		 System.out.println("Informe a altura do retângulo: ");
		 retangulo.height = sc.nextDouble();
		 System.out.println("Informe a largura do retângulo: ");
		 retangulo.width = sc.nextDouble();
		 
		 /*com isso até aqui estamos guardando os dados recebidos pelo usuário no objeto retangulo
		  da classe Rectangle para informa-los mais tarde.*/
		 
		 System.out.println(retangulo);
		
		
		
		
		
		
		sc.close();

	}

}
