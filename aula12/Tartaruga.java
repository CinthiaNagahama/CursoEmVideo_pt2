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
	
	// Métodos Sobrescritos
	@Override
	public void alimentar() {
		System.out.println("Herbívoro");
	}
	
	@Override
	public void vocalizar() {
		System.out.println("Tartaruga não faz som");
	}
	
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}
}
