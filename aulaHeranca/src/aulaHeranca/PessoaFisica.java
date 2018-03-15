package aulaHeranca;

public class PessoaFisica extends Pessoa {
	private String rg;
	private String cpf;
	private String sexo;
	
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public static void main(String[] args) {
		PessoaFisica pearson = new PessoaFisica();
		
		pearson.setNome("Wanderson Pinto");
		pearson.setCpf("151.836.951-13");
		pearson.setRg("46.321.456-x");
		pearson.setEmail("Warzinhoplay1177@gmail.com");
		pearson.setTelefone("(11)94566-8581");
		pearson.setSexo("Indefinido");
		pearson.setEndereco("Rua dos Malaquias");
		pearson.setCidade("São Paulo");
		
		System.out.println(pearson.getNome());
		System.out.println(pearson.getRg());
		System.out.println(pearson.getCpf());
		System.out.println(pearson.getSexo());
		System.out.println(pearson.getTelefone());
		System.out.println(pearson.getEmail());
		System.out.println(pearson.getEndereco());
		System.out.println(pearson.getCidade());
	}

}
