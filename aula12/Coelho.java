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
	
	// M�todos Sobrescritos
	@Override
	public void alimentar() {
		System.out.println("Herb�voro");
	}
	
	@Override
	public void vocalizar() {
		System.out.println("Coelho n�o faz som");
	}
	
	@Override
	public void locomover() {
		System.out.println("Pulando");
	}
}
