package aula12;

public class Sapo extends Anfibio{
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
		System.out.println("Comendo insetos");
	}
	
	@Override
	public void vocalizar() {
		System.out.println("Croac");
	}
	
	@Override
	public void locomover() {
		System.out.println("Pulando");
	}
}
