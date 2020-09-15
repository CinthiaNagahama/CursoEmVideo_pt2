package aula10;

public class Professor extends Pessoa{
	private String especialidade;
	private double salario;
	
	public Professor(String nome, int idade, String especialidade, char sexo) {
		super(nome, idade, sexo);
		this.setEspecialidade(especialidade);
	}
	
	// Getters e Setters
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// Métodos
	public void aumento(float porcentagemAumento) {
		this.setSalario(porcentagemAumento * this.getSalario() + this.getSalario());
	}
}
