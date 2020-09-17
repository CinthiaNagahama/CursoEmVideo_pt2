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
	
	// M�todos Sobrescritos
	@Override
	public void alimentar() {
		System.out.println("Carn�voro");
	}
	
	@Override
	public void vocalizar() {
		System.out.println("Cobra n�o faz som");
	}
}
