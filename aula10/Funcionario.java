package aula10;

public class Funcionario extends Pessoa{
	private String setor;
	private boolean trabalhando;
	
	public Funcionario(String nome, int idade, String setor, char sexo) {
		super(nome, idade, sexo);
		this.setSetor(setor);
	}
	
	// Getters e Setters
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	// Métodos
	public void empregado() {
		this.setTrabalhando(!isTrabalhando());
	}
}
