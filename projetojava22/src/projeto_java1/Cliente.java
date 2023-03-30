package projeto_java1;

public class Cliente {
	
    private int id;
	private String nome;
    private int idade;
    private String endereco;
    private String telefone;
    private String email;
    
	public Cliente(int id, String nome, int idade, String endereco, String telefone, String email) {
		this.nome = nome;
		this.idade = idade;
		this.id = id;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public void visualizar() {
		
		System.out.println("***********************************");
        System.out.println("        PERFIL DO CLIENTE"          );
        System.out.println("***********************************");
        System.out.println("Identificador: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("E-mail: " + this.email);
        System.out.println("***********************************");
        System.out.println("\n");
    
}
}