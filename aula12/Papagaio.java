package aula12;

public class Papagaio extends Ave{
	private String especie;

	// Getters e Setters
	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	// M�todos Sobrescritos
		@Override
		public void alimentar() {
			System.out.println("On�voro");
		}
		
		@Override
		public void vocalizar() {
			System.out.println("Caa");
		}
}
