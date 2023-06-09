package parte5DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
public class ProgramDataHoraCustomizacao {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	//classe instanciada com o nome fmt3 chamando o metodo ofPattern para customizar a DataHora 
	//chamando em seguida o metodo withZone indicando o ZoneId.systemDefault para hora de parâmetro
	//ou seja a Datahora do computador do usuário.
	DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
	
	DateTimeFormatter fmt4= DateTimeFormatter.ISO_DATE_TIME;//metodo Static
	DateTimeFormatter fmt5=DateTimeFormatter.ISO_INSTANT;	
	LocalDate d01 = LocalDate.parse("2023-06-09"); 
	LocalDateTime d02 =LocalDateTime.parse("2023-06-09T11:53:56");
	Instant d03 = Instant.parse("2023-06-09T11:53:56Z");
	
	
	System.out.println("d01 = " + d01.format(fmt1));
	//obj da classe LocalDate usa obj da Classe DateTimeFormatter de parâmetro
	System.out.println("d01 = " + fmt1.format(d01));
	//obj da classe DateTimeFormatter usa obj da Classe LocalDate de parâmetro
	System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	//usa direto a chamada do metodo ofPattern ^^^^^^^TODOS A CIMA DEVOLVEM O MESMO RESULTADO.
	
	System.out.println("d02 = " + d02.format(fmt1));// ACRESENTA SEGUNDOS NA INSTANCIAÇÃO MAS, APRESENTA 
	//MESMO RESULTADO d01
	System.out.println("d02 = " + d02.format(fmt2));// ACRESENTA SEGUNDOS NA INSTANCIAÇÃO
	System.out.println("d02 = " + d02.format(fmt4));//MOSTRA A DATA NO MODELO ISO8601

	System.out.println("d03 = " + fmt3.format(d03));//O PRÓPRIO JAVA PEGA O HORARIO APRESENTADO E CONVERTE
	//PARA A DATA E HORA LOCAL DO USUÁRIO
	/*CHAMA PRIMEIRO O OBJ DA CLASSE DE FORMATAÇÃO E FORNECE O OBJ DA CLASSE Instant COMO ARGUMENTO 
	 * OU PARÂMETRO*/
	System.out.println("d03 = " + fmt5.format(d03));//esse é igual ao de baixo
	System.out.println("d03 = " + d03.toString());//esse é igual o de cima
	
	
	
	
	
	
	
	
	}

}
