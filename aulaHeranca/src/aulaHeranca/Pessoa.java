package aulaHeranca;

public class Pessoa {

	private String nome;
	private String endereco;
	private String cidade;
	private String telefone;
	private String email;
	
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome) {	
			this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
