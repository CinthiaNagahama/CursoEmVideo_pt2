package aula12;

public class Tartaruga extends Reptil{
	private String especie;

	// Getters e Setters
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	// M�todos Sobrescritos
	@Override
	public void alimentar() {
		System.out.println("Herb�voro");
	}
	
	@Override
	public void vocalizar() {
		System.out.println("Tartaruga n�o faz som");
	}
	
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}
}
