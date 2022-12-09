package ed;

public class ContaPoupanca extends Conta {
	private static double taxa = 0.1;

	public ContaPoupanca(double saldo) {
		creditar(saldo);
	}

	public ContaPoupanca(Pessoa cliente, double saldo) {
		this(saldo);
		this.setCliente(cliente);
	}
	public ContaPoupanca(PessoaFisica cliente, double saldo) {
		this(saldo);
		this.setCliente(cliente);
	}
	public ContaPoupanca(PessoaJuridica cliente, double saldo) {
		this(saldo);
		this.setCliente(cliente);
	}

	public void rendeJuros() {
		creditar(taxa * this.saldo);
	}
}
