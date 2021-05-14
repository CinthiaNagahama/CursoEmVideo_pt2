package youTube;

// Todo Espectador é uma Pessoa, logo ele estende a classe Pessoa e herda as características de sua superclasse
public class Espectador extends Pessoa{
	private String login;
	private int totalAssistido;
	
	public Espectador(String nome, int idade, char sexo, String login) {
		super(nome, idade, sexo);
		this.setLogin(login);
		this.setTotalAssistido(0);
	}

	// Getters e Setters
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotalAssistido() {
		return totalAssistido;
	}
	public void setTotalAssistido(int d) {
		this.totalAssistido = d;
	}
	
	// Métodos herdados da superclasse podem ser reescritos (polimorfismo)
	@Override
	protected void ganharEXP() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nLogin: " + this.getLogin() + 
				"\nTotal de vídeos assistidos: " + this.getTotalAssistido();
	}
	
	// Métodos
	public void assistir() {
		this.setTotalAssistido(getTotalAssistido() + 1);
	}
	
}
