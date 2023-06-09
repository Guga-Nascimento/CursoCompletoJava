package parte5DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramDataHora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*Para inverte o modelo universal para o modelo dia,mes,ano, deve instanciar um objeto na classe DateTimeFormatter
		 com o metodo estático ofPattern chamando o obj quando necessario*/
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		                               
		System.out.print("Me mostre a data de agora                                                    \n");
		LocalDate d01 = LocalDate.now(); //instancia um obj do tipo LocalDate depois chama o obj
		System.out.println(d01);
	    System.out.println("________________________________________________________________________________________________");
	                                  
		System.out.print("Me mostre a data e a hora de agora                                      \n");
		LocalDateTime d02 =LocalDateTime.now();//instanciando novo obj
		System.out.println(d02);
	    System.out.println("________________________________________________________________________________________________");
	    
	    System.out.print("Me mostre a data e a hora de agora no modelo universal    \n");
	    Instant d03 = Instant.now();//Mostra a hora da Inglaterra
		System.out.println(d03);
	    System.out.println("________________________________________________________________________________________________");
	                                  
	    System.out.print("Me mostre a data com o parâmetro fornecido                       \n");
	    LocalDate d04 = LocalDate.parse("2023-06-09"); 
	    System.out.println(d04);
	    System.out.println("________________________________________________________________________________________________");
	    
	    System.out.print("Me mostre a data e a hora com o parâmetro fornecido       \n");
	    LocalDateTime d05 =LocalDateTime.parse("2023-06-09T11:53:56");
	    System.out.println(d05);
	    System.out.println("________________________________________________________________________________________________");
	    
	    System.out.print("Me mostre a data e a hora com o parâmetro fornecido no modelo universal      \n");
	    Instant d06 = Instant.parse("2023-06-09T11:53:56Z");//aqui mostra a hora da Inglaterra
	    System.out.println(d06);
	    System.out.println("________________________________________________________________________________________________");
	    
	    System.out.print("Me mostre a data e a hora com o parâmetro fornecido no modelo universal       \n");
		Instant d07 = Instant.parse("2023-06-09T11:53:56-03:00");//Aqui mostra a hora local pq estamos no fuso -3
	    System.out.println(d07);
	    System.out.println("________________________________________________________________________________________________");
	    
	    System.out.print("Me mostre a data no padrão brasileiro sendo dia/mes/ano       \n");
	    LocalDate d08 = LocalDate.parse("20/05/2023",fmt1);//usando o obj instanciado da classe DataTimeFormatter
	    System.out.println(d08);
	    System.out.println("________________________________________________________________________________________________");
	    
	    System.out.print("Me mostre a data e a hora no padrão brasileiro sendo dia/mes/ano      \n");
	    LocalDateTime d09 =LocalDateTime.parse("20/05/2023 01:30",fmt2);
	    System.out.println(d09);
	    System.out.println("________________________________________________________________________________________________");
		
	    System.out.print("Usando o metodo of  'para instanciar de maneira independente cada elemento'     \n");
	    LocalDateTime d10 =LocalDateTime.of(2023,05,05,01,32);
	    System.out.println(d10);
	    System.out.println("________________________________________________________________________________________________");
		
	    System.out.print("Usando o metodo of                                                                       \n");
	    LocalDate d11 =LocalDate.of(1988, 2, 11);
	    System.out.println(d11);
	    

		sc.close();

	}

}
