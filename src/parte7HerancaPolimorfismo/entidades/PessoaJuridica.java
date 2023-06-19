package parte7HerancaPolimorfismo.entidades;

public class PessoaJuridica extends CadastroContribuinte{
	
	private Integer numeroFuncionarios;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendimentoAnual, Integer numeroFuncionarios) {
		super(nome, rendimentoAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double taxaImposto() {
		if (numeroFuncionarios <= 10) {
			double soma = getRendimentoAnual() * 0.16;
			return soma;
		}else { 
			double soma = getRendimentoAnual() * 0.14;
			return soma;
		}
		
	}
	
	

}
