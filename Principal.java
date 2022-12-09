package ed;

public class Principal {
	public static void main(String[] args) {

		PessoaFisica cliente1 = new PessoaFisica("Pedro", "Neto","12345678911");
		
		Conta conta1 = new Conta(cliente1);
		conta1.creditar(2000.0);
		conta1.debitar(100);

		PessoaJuridica cliente2 = new PessoaJuridica("Cicero","00123456/0000-45","Caridade");
		ContaEspecial conta2 = new ContaEspecial(cliente2);
		conta2.debitar(500);

		PessoaFisica cliente3 = new PessoaFisica("Samuel","Sonhar","00011122233");
		ContaPoupanca conta3 = new ContaPoupanca(cliente3,1000);
		conta3.rendeJuros();

		System.out.println(conta1);

		System.out.println(conta2);

		System.out.println(conta3);
	}
}
