package aula12;

public class Ave extends Animal{
	private String corPenas;
	
	// Getters e Setters
	public String getCorPenas() {
		return corPenas;
	}

	public void setCorPenas(String corPenas) {
		this.corPenas = corPenas;
	}

	// M�todos Sobrescritos
	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo");
	}

	@Override
	public void vocalizar() {
		System.out.println("Piu");
	}
	
	// Outros m�todos
	public void fazerNinho() {
		System.out.println("Ninho pronto");
	}
}
