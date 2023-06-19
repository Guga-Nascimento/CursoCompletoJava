package parte7HerancaPolimorfismo.entidades;

public class PessoaFisica  extends CadastroContribuinte{
	
	private Double gastosComSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendimentoAnual, Double gastosComSaude) {
		super(nome, rendimentoAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public Double taxaImposto() {
		if(getRendimentoAnual() <= 20000.00) {
			Double soma = (getRendimentoAnual() * 0.15) - (gastosComSaude / 2);
			return soma;			
		}else if (getRendimentoAnual() > 20000.00) {
			Double soma = (getRendimentoAnual() * 0.25) - (gastosComSaude / 2);
			return soma;	
		}else {
			return null;
		}
	}
	
	

}
