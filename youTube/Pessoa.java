package youTube;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected char sexo;
	protected int experiencia;
	
	public Pessoa(String nome, int idade, char sexo) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setExperiencia(0);
	}
	
	// Getters e Setters
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
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	// Métodos
	protected abstract void ganharEXP();

	@Override
	public String toString() {
		return "Nome: " + this.getNome() + 
				"\nIdade: " + this.getIdade() + 
				"\nSexo: " + this.getSexo() +
				"\nExperiência: " + this.getExperiencia();
	}
}
