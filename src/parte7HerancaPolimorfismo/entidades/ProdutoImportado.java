package parte7HerancaPolimorfismo.entidades;

public class ProdutoImportado extends ProdutoNacional{
	
	private Double taxaExportacao;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxaExportacao) {
		super(nome, preco);
		this.taxaExportacao = taxaExportacao;
	}

	public Double getTaxaExportacao() {
		return taxaExportacao;
	}

	public void setTaxaExportacao(Double taxaExportacao) {
		this.taxaExportacao = taxaExportacao;
	}
	public Double precoTotal(Double preco) {
		return preco + taxaExportacao;
	}
	@Override
	public void etiquetaPreco() {
		System.out.println();
		 System.out.println(getNome()+" R$: " +String.format("%.2f (Taxa Importação:) R$: %.2f",(getPreco()+getTaxaExportacao()),getTaxaExportacao()));
	}
}
