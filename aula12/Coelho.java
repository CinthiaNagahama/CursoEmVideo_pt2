package aula12;

public class Coelho extends Mamifero{
	private String raca;

	// Getters e Setters
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	// Métodos Sobrescritos
	@Override
	public void alimentar() {
		System.out.println("Herbívoro");
	}
	
	@Override
	public void vocalizar() {
		System.out.println("Coelho não faz som");
	}
	
	@Override
	public void locomover() {
		System.out.println("Pulando");
	}
}
