package aula11;

public class Aluno extends Pessoa{
	private int matricula;
	private String curso;
	
	public Aluno(String nome, int idade, char sexo) {
		super(nome, idade, sexo);
	}

	// Getters e Setters
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	// Métodos
	public void cancelarMatricula() {
		this.setMatricula(0);
		this.setCurso(null);
		System.out.println("\nMatrícula cancelada com sucesso!\n");
	}
	
	public void pagarMensalidade() {
		System.out.println("\nMensalidade paga com sucesso!\n");
	}
}
