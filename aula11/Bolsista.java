package aula11;

public final class Bolsista extends Aluno{
	private double bolsa;
	
	public Bolsista(String nome, int idade, char sexo) {
		super(nome, idade, sexo);
	}
	
	// Getters e Setters
	public double getBolsa() {
		return bolsa;
	}
	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}
	
	// Métodos
	public void renovarBolsa() {
		this.pagarMensalidade();
		System.out.println("\nBolsa renovada com sucesso!\n");
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println("\nBolsa de 100%\n");
	}
}
