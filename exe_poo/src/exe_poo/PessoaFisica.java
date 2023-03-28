package exe_poo;

public class PessoaFisica extends Exer01_Cliente {
	
	private String cpf;
	
	public PessoaFisica(String nome, int idade, String sexo, String cidade, String telefone, String cpf) {
		super(nome, idade, sexo, cidade, telefone);
		this.cpf = cpf;
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override //sobreescrita
    public void visualizar() {
    	super.visualizar();
    	System.out.println("Cpf:" + this.cpf);
		
	}
}

