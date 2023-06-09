package parte5DataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ProgramCalcularDatas {

	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("1988-02-11");
		LocalDateTime d05 = LocalDateTime.parse("1988-02-11T10:00:26");
		Instant d06 = Instant.parse("1988-02-11T01:30:26Z");
		
		LocalDate pastWeekDate = d04.minusDays(7);//subtrair dias"pastWeekDate == SEMANA PASSADA"
		LocalDate nextWeekDate = d04.plusDays(7);//adiciona dias"nextWeekDat == PROXIMA SEMANA"
		
		LocalDateTime pastWeekLocalDate = d05.minusDays(7);//COM HORAS,MINUTOS E SEGUNDOS COM NANOSEGUNDOS
		LocalDateTime nextWeekLocalDate = d05.plusDays(7);//COM HORAS,MINUTOS E SEGUNDOS COM NANOSEGUNDOS
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);//SUBTRAIR COM A CLASSE Instant
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);//ADICIONAR COM A CLASSE Instant
		
		System.out.println("pastWeekDate = " + pastWeekDate);
		System.out.println("nextWeekDate = " + nextWeekDate);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		
		///DESCOBRIR A DURAÇÃO
Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay());//convetida a meia noite"inicio dia"
		Duration t5 = Duration.between(pastWeekDate.atTime(0,0), d04.atTime(0,0));//Editando a hr de inicio e fim
		Duration t2 = Duration.between(pastWeekLocalDate, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);

		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t1 dias = " + t5.toDays());
		System.out.println("t1 dias = " + t1.toHours());
		System.out.println("t1 dias = " + t1.toMinutes());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}
	}

