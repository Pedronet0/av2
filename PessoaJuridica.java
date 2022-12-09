package ed;

public class PessoaJuridica extends Pessoa {

	protected String cnpj;
	protected String razaoSocial;
	
	public PessoaJuridica(String nome,String cnpj,String razaoSocial) {
		super(nome);
		this.cnpj = cnpj;
		this.razaoSocial =razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	@Override
	public String toString() {
		return "\n\nnome: " + this.getNome()
		      +"\ncnpj: " + this.getCnpj()
		      +"\nrazao social: " + this.getRazaoSocial();
	}
}
