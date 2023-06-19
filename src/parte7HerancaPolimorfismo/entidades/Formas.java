package parte7HerancaPolimorfismo.entidades;

import parte7HerancaPolimorfismo.entidades.Enums.Cor;

public abstract class Formas {
	
	private Cor cor;
	
	public Formas() {
		
	}

	public Formas(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	public abstract double area(); 
}
