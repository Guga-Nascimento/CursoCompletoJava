package parte6EnumeracaoComposicaoEntities;

import java.util.Date;

public class ContratoPorHora {//nome da classe
	
	private Date data;//Atributo do tipo Date para receber a data e com o nome de data
	private Double valorDaHora;//Atributo double para receber o valor  da hora 
	private Integer horas;//atributo do tipo Integer para receber quantas horas tem no contrato
	public ContratoPorHora() {//contrutor para instanciação de objetos vazio, ou seja sem a necessidade de receber parâmetros
	
	}
	
	//VVV Construtor com parâmetros definidos que serão recebidos quando o objeto instanciado com esse contrutor.
	public ContratoPorHora(Date data, Double valorDaHora, Integer horas) {
		this.data = data;
		this.valorDaHora = valorDaHora;
		this.horas = horas;
	}
	public Date getData() {//get para consultar dados recebidos no atributo data
		return data;
	}
	public void setData(Date data) {//set para modificar o dado já recebido no atributo data
		this.data = data;
	}
	public Double getValorDaHora() {
		return valorDaHora;
	}
	public void setValorDaHora(Double valorDaHora) {
		this.valorDaHora = valorDaHora;
	}
	public Integer getHoras() {
		return horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	public double valorTotal() {
		return horas * valorDaHora;
	}
	
	

}
