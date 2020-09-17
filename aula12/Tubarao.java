package aula12;

public class Tubarao extends Peixe{
	private String especie;

	// Getters e Setters
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	// Métodos Sobrescritos
		@Override
		public void alimentar() {
			System.out.println("Carnívoro");
		}
}
