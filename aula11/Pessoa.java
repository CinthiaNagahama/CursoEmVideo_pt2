package aula11;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	
	public Pessoa(String nome, int idade, char sexo) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
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
	
	// Métodos
	public void fazAniversario() {
		this.setIdade(this.getIdade() + 1);
	}
	
	public String toString() {
		return "\nNome: " + this.getNome() + ", Idade: " + this.getIdade() + ", Sexo: " + this.getSexo();
	}
}