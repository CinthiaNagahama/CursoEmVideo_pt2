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

	// M�todos Sobrescritos
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
		System.out.println("Peixe n�o faz sons");
	}
	
	// Outros m�todos
	public void soltarBolhas() {
		System.out.println("Bolhas");
	}
}
