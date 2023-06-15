package parte6EnumeracaoComposicao;
//criado a enum para especificar o nivel do trabalhador
//criado as classes (contraPor Hora, Departamento e Trabalhador) 
//feita a composição inclusive criada uma lista para gusradas todos os contratos do trabalhador
//metodo de todas as classe 


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import parte6EnumeracaoComposicaoEntities.ContratoPorHora;
import parte6EnumeracaoComposicaoEntities.Departamento;
import parte6EnumeracaoComposicaoEntities.Trabalhador;
import parte6EnumeracaoComposicaoEntities.enums.NivelTrabalhador;

public class ProgramTrabalhador {
	
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);//locale para padronizar o separador decimal como .
		Scanner sc = new Scanner(System.in);//Classe Scanner para receber dados
		SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");//Classe para padronizar formato da data como 
		//indica "dd/MM/yyyy"
		
		System.out.print("Entre com o nome do departamento: ");//recebendo dados necessario para instanciar o obj
		String nomeDepartamento = sc.nextLine();//recebendo dados necessario para instanciar o obj
		System.out.print("Informe os dados do trabalhador: ");//recebendo dados necessario para instanciar o obj
		System.out.print("Name: ");//recebendo dados necessario para instanciar o obj
		String nomeTrabalhador = sc.nextLine();//recebendo dados necessario para instanciar o obj
		System.out.print("Nível: ");//recebendo dados necessario para instanciar o obj
		String nivelTrabalhador = sc.nextLine();//recebendo dados necessario para instanciar o obj
		System.out.print("Salário base: ");//recebendo dados necessario para instanciar o obj
		double  salarioBase = sc.nextDouble();//recebendo dados necessario para instanciar o obj
		
		/*Instanciando o obj trabalhador da classe Trabalhador com parâmetros*/
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador,NivelTrabalhador.valueOf(nivelTrabalhador)	,salarioBase,new Departamento(nomeDepartamento));
		
	
		System.out.println("Quantos Contratos Este Trabalhador Fez: ");
		int n = sc.nextInt();//recebendo o numeros de contratos
		
		for (int i =0; i < n;i ++) {//for para digitação de contrato por contrato
			System.out.println("Entre com o contrato #" + (i+1));
			System.out.println("Data: ");
			Date dataDoContrato = sdt.parse(sc.next());//chamando o obj SimpleDateFormat para receber a data
			System.out.println("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.println("Duração do contrato: ");
			int horas = sc.nextInt();
			ContratoPorHora contrato = new ContratoPorHora(dataDoContrato,valorPorHora,horas); 
			//^^^ Instanciando o obj contrato da Classe Contrato pata guardar cada contrato na List contrato
			trabalhador.addContrato(contrato);			
		}
		System.out.println();
		System.out.println("Entre com o mês e o ano para calcular o salário: ");
		String mesEano = sc.next();
		int mes = Integer.parseInt(mesEano.substring(0, 2));
		int ano = Integer.parseInt(mesEano.substring(3));
		System.out.println("Name: " + trabalhador.getName());
		System.out.println("Departamento: "+ trabalhador.getDepartamento().getName());
		System.out.println("Calculo: " + mesEano + ": "+ String.format("%.2f,",trabalhador.calcular(ano, mes)));
		sc.close();
	}

}
