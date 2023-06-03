package parte4MemoriaVetoresListasEntities;

public class Ultilidades {
	
	private int n;
    private int soma;

	public Ultilidades(int n, int soma) {
		super();
		this.n = n;
		soma(soma);
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public int getSoma() {
		return soma;
	}
	public void setSoma(int soma) {
		this.soma = soma;
	}
	public static int soma(int soma) {
		return soma;		
	}
	public static double media(double media,int soma,int n) {
		return media = soma / n;
	}


	
	

}
