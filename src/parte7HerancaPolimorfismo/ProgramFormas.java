package parte7HerancaPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import parte7HerancaPolimorfismo.entidades.Circulo;
import parte7HerancaPolimorfismo.entidades.Formas;
import parte7HerancaPolimorfismo.entidades.Retangulo;
import parte7HerancaPolimorfismo.entidades.Enums.Cor;



public class ProgramFormas {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Fazer um programa para ler os dados de N figuras (N fornecido
pelo usuário), e depois mostrar as áreas destas figuras na
mesma ordem em que foram digitadas.*/
		
		System.out.print("Digite o número de formas: ");
		int n = sc.nextInt();

		
		List <Formas> lista = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Forma n°"+i);
			System.out.print("Retangulo ou círculo (r ou c) ");
			char ch =sc.next().charAt(0);
			System.out.print("Qual a cor desejada? ");
			Cor cor = Cor.valueOf(sc.next());
			if (ch == 'c') {
				System.out.print("Informe o raio ");
				Double raio = sc.nextDouble();
				lista.add(new Circulo(cor, raio) );
			}else if (ch == 'r') {
				System.out.println("Informe a largura ");
				Double largura = sc.nextDouble();
				System.out.println("Informe a altura ");
				Double altura = sc.nextDouble();
				lista.add(new Retangulo(cor, largura, altura));
			}else {
				System.err.println("Dados inválidos \n\nREINICIE O PROGRAMA. ");
			}
		}
		
		for (Formas formas : lista) {
			System.out.println();
			System.out.printf("Area: %.2f\n", formas.area());
		}
		
		
		
		
		
		
		sc.close();
	}

}
