package aula13;

public class Mamifero extends Animal{
	private String corPelo;
	
	// Getters e Setters
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
	// M�todos Sobrescritos
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}

	@Override
	public void vocalizar() {
		System.out.println("Som de mam�fero");
	}
}