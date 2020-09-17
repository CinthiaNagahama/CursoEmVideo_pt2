package aula12;

public class Reptil extends Animal{
	private String corEscama;
	
	// Getters e Setters
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	// Métodos Sobrescritos
	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo");
	}

	@Override
	public void vocalizar() {
		System.out.println("Som de réptil");
	}
}
