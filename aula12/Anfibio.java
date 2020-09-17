package aula12;

public class Anfibio extends Animal{
	private String cor;
	private String fase; // Aqu�tica ou terrestre
	
	// Getters e Setters
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getFase() {
		return fase;
	}

	public void setFase(String fase) {
		this.fase = fase;
	}

	// M�todos Sobrescritos
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
		System.out.println("Som de anf�bio");
	}	
}
