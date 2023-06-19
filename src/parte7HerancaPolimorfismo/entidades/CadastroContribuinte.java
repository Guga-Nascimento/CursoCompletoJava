package parte7HerancaPolimorfismo.entidades;

public abstract class CadastroContribuinte {
	
	private String nome;
	private Double rendimentoAnual;
	
	public CadastroContribuinte() {
		
	}

	public CadastroContribuinte(String nome, Double rendimentoAnual) {
		this.nome = nome;
		this.rendimentoAnual = rendimentoAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendimentoAnual() {
		return rendimentoAnual;
	}

	public void setRendimentoAnual(Double rendimentoAnual) {
		this.rendimentoAnual = rendimentoAnual;
	}
	public abstract Double taxaImposto();
	
}
