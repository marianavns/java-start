
class Cliente {
	
	// Foi interessante deletar os sets de nome e cpf
	// Pois os valores já estão sendo "setados" no construtor.
	private String nome;
	private String cpf;
	private int idade;
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	

}
