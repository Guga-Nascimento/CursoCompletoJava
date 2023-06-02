package parte3ConstrutoresThisSobrecargaEncapsulamentoApplication;

import java.util.Locale;
import java.util.Scanner;

import parte3ConstrutoresThisSobrecargaEncapsulamentoEntities.Conta;

public class ProgramConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * Em um banco, para se cadastrar uma conta bancária, é necessário informar o
		 * número da conta, o nome do titular da conta, e o valor de depósito inicial
		 * que o titular depositou ao abrir a conta. Este valor de depósito inicial,
		 * entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar
		 * no momento de abrir sua conta, o depósito inicial não será feito e o saldo
		 * inicial da conta será, naturalmente, zero. Importante: uma vez que uma conta
		 * bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome
		 * do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião
		 * de casamento, por exemplo). Por fim, o saldo da conta não pode ser alterado
		 * livremente. É preciso haver um mecanismo para proteger isso. O saldo só
		 * aumenta por meio de depósitos, e só diminui por meio de saques. Para cada
		 * saque realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar
		 * com saldo negativo se o saldo não for suficiente para realizar o saque e/ou
		 * pagar a taxa. Você deve fazer um programa que realize o cadastro de uma
		 * conta, dando opção para que seja ou não informado o valor de depósito
		 * inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando
		 * os dados da conta após cada operação.
		 */

		System.out.println("Informe o Númereo da Conta: ");
		Integer numeroConta = sc.nextInt();
		System.out.println("Informe o Nome do Titular da Conta: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Deseja efetuar um depósito? s/n ");
		char result = sc.nextLine().charAt(0);
		if (result == 's' || result == 'S') {
			System.out.println("Informe o valor do depósito");
			double saldo = sc.nextDouble();
			Conta cliente01 = new Conta(name.toUpperCase(), numeroConta, saldo);
			System.out.println(cliente01);

			System.out.println("Informe a opção desejada\n" + "Opção 1 == Despósito\n" + "Opção 2 == Saque\n"
					+ "Opção 3 == Consultar Saldo\n" + "Opção 4 == Encerrar atendimento");
			int x = sc.nextInt();
			switch (x) {
			case 1:
				System.out.println("Informe o Valor do Depósito ");
				double deposito = sc.nextDouble();
				cliente01.deposito(deposito);
				System.out.println(cliente01);
				break;
			case 2:
				System.out.println("Informe o Valor do Saque ");
				double saque = sc.nextDouble();
				cliente01.saque(saque);
				System.out.println(cliente01);
				break;
			case 3:
				System.out.println(cliente01);
				break;
			case 4:
				System.err.println("Obrigado Volte Sempre!");
				break;
			default:
				System.out.println("Dados inválidos novamente reinicie o cadastro do início.");
				break;
			}
		} else if (result == 'n' || result == 'N') {
			Conta cliente01 = new Conta(name.toUpperCase(), numeroConta);
			System.out.println(cliente01);

			System.out.println("Informe a opção desejada\n" + "Opção 1 == Despósito\n" + "Opção 2 == Saque\n"
					+ "Opção 3 == Consultar Saldo\n" + "Opção 4 == Encerrar atendimento");
			int x = sc.nextInt();
			switch (x) {
			case 1:
				System.out.println("Informe o Valor do Depósito ");
				double deposito = sc.nextDouble();
				cliente01.deposito(deposito);
				System.out.println(cliente01);
				break;
			case 2:
				System.out.println("Informe o Valor do Saque ");
				double saque = sc.nextDouble();
				cliente01.saque(saque);
				System.out.println(cliente01);
				break;
			case 3:
				System.out.println(cliente01);
				break;
			case 4:
				System.err.println("Obrigado Volte Sempre!");
				break;
			default:
				System.out.println("Dados inválidos novamente reinicie o cadastro do início.");
				break;
			}

		} else {
			System.err.println("Dado inválido");
			System.out.println("Digite 's' para de positar\nDigite 'n' para continuar sem depositar");
			result = sc.nextLine().charAt(0);
			if (result == 's' || result == 'S') {
				System.out.println("Informe o valor do depósito");
				double saldo = sc.nextDouble();
				Conta cliente01 = new Conta(name.toUpperCase(), numeroConta, saldo);
				System.out.println(cliente01);

				System.out.println("Informe a opção desejada\n" + "Opção 1 == Despósito\n" + "Opção 2 == Saque\n"
						+ "Opção 3 == Consultar Saldo\n" + "Opção 4 == Encerrar atendimento");
				int x = sc.nextInt();
				switch (x) {
				case 1:
					System.out.println("Informe o Valor do Depósito ");
					double deposito = sc.nextDouble();
					cliente01.deposito(deposito);
					System.out.println(cliente01);
					break;
				case 2:
					System.out.println("Informe o Valor do Saque ");
					double saque = sc.nextDouble();
					cliente01.saque(saque);
					System.out.println(cliente01);
					break;
				case 3:
					System.out.println(cliente01);
					break;
				case 4:
					System.err.println("Obrigado Volte Sempre!");
					break;
				default:
					System.out.println("Dados inválidos novamente reinicie o cadastro do início.");
					break;
				}
			} else if (result == 'n' || result == 'N') {
				Conta cliente01 = new Conta(name.toUpperCase(), numeroConta);
				System.out.println(cliente01);

				System.out.println("Informe a opção desejada\n" + "Opção 1 == Despósito\n" + "Opção 2 == Saque\n"
						+ "Opção 3 == Consultar Saldo\n" + "Opção 4 == Encerrar atendimento");
				int x = sc.nextInt();
				switch (x) {
				case 1:
					System.out.println("Informe o Valor do Depósito ");
					double deposito = sc.nextDouble();
					cliente01.deposito(deposito);
					System.out.println(cliente01);
					break;
				case 2:
					System.out.println("Informe o Valor do Saque ");
					double saque = sc.nextDouble();
					cliente01.saque(saque);
					System.out.println(cliente01);
					break;
				case 3:
					System.out.println(cliente01);
					break;
				case 4:
					System.err.println("Obrigado Volte Sempre!");
					break;
				default:
					System.out.println("Dados inválidos novamente reinicie o cadastro do início.");
					break;
				}
			} else {
				System.out.println("Dados inválidos novamente reinicie o cadastro do início.");
			}
		}
		sc.close();
	}

}
