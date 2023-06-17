package parte7HerancaPolimorfismo.entidades;

public class ProdutoNacional {
	
	private String nome;
	private Double preco;
	
	public ProdutoNacional() {
		super();
	}

	public ProdutoNacional(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public void etiquetaPreco() {
		 System.out.println(getNome()+ " R$: " +String.format("%.2f",  getPreco()));
	}

}
