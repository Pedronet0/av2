package ed;

public class PessoaFisica extends Pessoa {
	protected String sobrenome;
	protected String cpf;
	
	public PessoaFisica(String nome,String sobrenome,String cpf) {
		super(nome);
		this.sobrenome = sobrenome;
		this.cpf = cpf;	
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	@Override
	public String toString(){
		return "\n\nnome: " + this.getNome()
		      + "\nsobrenome: " + this.getSobrenome()
		      + "\ncpf: " + this.getCpf();
	}
}
