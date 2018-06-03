
public class Pessoa {
	private String nome;
	private int idade;
	private Sexo sexo;

	public Pessoa(String nome, int idade,Sexo sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public Sexo getSexo(){
		return sexo;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	
}
