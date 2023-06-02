package parte3ConstrutoresThisSobrecargaEncapsulamentoEntities;

public class Conta {
	
	private String name;
	private Integer numeroConta;
	private double saldo;
	public Conta(String name, Integer numeroConta, double saldo) {
		super();
		this.name = name;
		this.numeroConta = numeroConta;
		deposito(saldo);//importante conceito que protege o programa de mudanças futuras
	}
	public Conta(String name, Integer numeroConta) {
		super();
		this.name = name;
		this.numeroConta = numeroConta;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public String toString() {
		return name
				+ "\nnumeroConta= " + numeroConta 		
				+ "\nsaldo= " + saldo;
	}
	public double deposito(double deposito) {
		return saldo += deposito;
	}
	public double saque(double saque) {
		return saldo -= (saque +  5.00);
	}
	
	}
