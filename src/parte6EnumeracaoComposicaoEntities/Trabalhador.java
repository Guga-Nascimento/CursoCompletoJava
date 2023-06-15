package parte6EnumeracaoComposicaoEntities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import parte6EnumeracaoComposicaoEntities.enums.NivelTrabalhador;

public class Trabalhador {

	private String name; //Atributo name para recever o nome do Trabalhador
	private NivelTrabalhador nivel;//nivel do tipo enumeração 
	private Double salarioBase;
	
	private Departamento departamento;//Ligando essa Classe Trabalhador a Classe Departamento para registrar
	//qual departamento pertence cada trabalhador
	private List <ContratoPorHora> contratos = new ArrayList<>();
	/*Criada a lista para receber os contratos de cada trabalhador e guarda-los, necessario o uso da lista porque 
	  cada Trabalhador pode ter mais de um contrato.
	  **IMPORTANTE LEMBRAR QUE LISTA NAO PODEM SEREM INSERIDAS NO CONSTRUTOR NEM CRIAR SETTERS 
	  PARA LISTA. ISSO RESULTARIA NA CRIAÇÃO DE UM NOVA LISTA DIVIDINDO OS DADOS*/
	
	public Trabalhador() {
		
	}

	

	public Trabalhador(String name, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
		super();
		this.name = name;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<ContratoPorHora> getContratos() {
		return contratos;
	}

	public void addContrato(ContratoPorHora contrato) {
		contratos.add(contrato);
	}
	public void removerContrato(ContratoPorHora contrato) {
		contratos.remove(contrato);
	}
	public double calcular(int ano,int mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();//CLASSE CALENDAR 
		
		for(ContratoPorHora c : contratos) {
			cal.setTime(c.getData());
			int cAno = cal.get(Calendar.YEAR);
			int cMes = 1 + cal.get(Calendar.MONTH);
			if (ano == cAno && mes == cMes) {
				soma+= c.valorTotal();
			}
		}
		return soma;
	}
	
	
}
