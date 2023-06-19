package parte7HerancaPolimorfismo.entidades;

import parte7HerancaPolimorfismo.entidades.Enums.Cor;

public class Circulo extends Formas{
	
	private Double raio;
	
	public Circulo() {
		super();
	}
	
	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}


	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return 3.14157 * (raio * raio);
	}
	

}
