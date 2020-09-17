package aula12;

public class Cobra extends Reptil{
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
		System.out.println("Carnívoro");
	}
	
	@Override
	public void vocalizar() {
		System.out.println("Cobra não faz som");
	}
}
