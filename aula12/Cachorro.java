package aula12;

public class Cachorro extends Mamifero{
	private String raca;

	// Getters e Setters
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	// M�todos Sobrescritos
	@Override
	public void alimentar() {
		System.out.println("On�voro");
	}
	
	@Override
	public void vocalizar() {
		System.out.println("Au Au");
	}
}
