package aula13;

public class Cachorro extends Mamifero{
	private String nome;
	private String raca;

	// Getters e Setters
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Métodos Sobrescritos
	@Override
	public void alimentar() {
		System.out.println("Onívoro");
	}
	
	@Override
	public void vocalizar() {
		System.out.println("Au Au");
	}
	
	// Outros Métodos
	public void reagir(String frase) {
		if(frase.equals("Senta")) {
			System.out.println("Sentado");
		}
		else if(frase.equals("Oi") || frase.equals(this.getNome())) {
			System.out.println("Abanar o rabo");
		}
		else if(frase.equals("Fala")) {
			this.vocalizar();
		}
		else System.out.println("Ignorar");
	}
	public void reagir(int hora) {
		if(hora < 12) {
			System.out.println("Ignorar");
		}
		else if(hora >= 12 || hora <= 13) {
			this.vocalizar();
		}
		else System.out.println("Ignorar");
	}
	public void reagir(boolean dono) {
		if(dono) {
			this.vocalizar();
			System.out.println("Abanar o rabo");
		}
		else System.out.println("Cheirar");
	}
}
