package parte7HerancaPolimorfismo.entidades;

public class EmpregadoTercerizado extends Empregado{
	
	private Double adicionalTercerizacao;
	
	
	public EmpregadoTercerizado() {
		super();
	}


	public EmpregadoTercerizado(String nome, Integer horas, Double valorPorHora, Double adicionalTercerizacao) {
		super(nome, horas, valorPorHora);
		this.adicionalTercerizacao = adicionalTercerizacao;
	}


	public Double getAdicionalTercerizacao() {
		return adicionalTercerizacao;
	}


	public void setAdicionalTercerizacao(Double adicionalTercerizacao) {
		this.adicionalTercerizacao = adicionalTercerizacao;
	}

	@Override
	public Double pagamento() {//NESSE METODO COM SOBREPOSIÇÃO CHAMAMOS O METODO ORIGINAL 
		//ATRAVEZ DO SUPER E INSERIMOS A LÓGICA DESEJADA PARA OBTERMOS OUTRO RESULTADO
		return super.pagamento()+(adicionalTercerizacao *1.1);
	}
	
}
