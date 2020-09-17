package aula12;

public class Peixe extends Animal{
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
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo");
	}

	@Override
	public void vocalizar() {
		System.out.println("Peixe não faz sons");
	}
	
	// Outros métodos
	public void soltarBolhas() {
		System.out.println("Bolhas");
	}
}
