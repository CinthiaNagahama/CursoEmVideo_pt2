package aula06;

public class ControleRemoto implements Controlador{
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	// Construtor
	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(false);
		this.setTocando(false);
	}
	
	// Métodos Especiais -> Getters e Setters
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private int getVolume() {
		return this.volume;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean isLigado() {
		return this.ligado;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	private boolean isTocando() {
		return this.tocando;
	}
	
	// Métodos Abstratos
	@Override
	public void ligar() {
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		this.setLigado(false);
	}

	@Override
	public void abriMenu() {
		System.out.println("A TV está ligada? " + (this.isLigado()?"Está ligada":"Está desligada"));
		System.out.println("A TV está tocando? " + (this.isTocando()?"Está tocando":"Não está tocando"));
		System.out.println("O volume está em: " + this.getVolume());
		
		for(int i = 0; i < this.getVolume(); i += 10) {
			System.out.print("[]");
		}
		System.out.print("\n");
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando o menu...\nMenu Fechado");
	}

	@Override
	public void maisVolume() {
		if(this.isLigado()) {
			this.setVolume(this.getVolume() + 5);
		}
		else {
			System.out.println("TV desligada.");
		}
	}

	@Override
	public void menosVolume() {
		if(this.isLigado()) {
			this.setVolume(this.getVolume() - 5);
		}
		else {
			System.out.println("TV desligada.");
		}
	}

	@Override
	public void ligarMudo() {
		if(!this.isLigado()) {
			System.out.println("TV desligada");
		}
		else if(this.getVolume() > 0) {
			this.setVolume(0);
			System.out.println("Mudo");
		}
		else {
			System.out.println("Já está mudo");
		}
	}

	@Override
	public void desligarMudo() {
		if(!this.isLigado()) {
			System.out.println("TV desligada");
		}
		else if(this.getVolume() == 0) {
			this.setVolume(50);
			System.out.println("Com som.");
		}
		else {
			System.out.println("Já está com som");
		}
	}

	@Override
	public void play() {
		if(!this.isLigado()) {
			System.out.println("TV desligada");
		}
		else if(!this.isTocando()) {
			this.setTocando(true);
			System.out.println("Tocando");
		}
		else {
			System.out.println("Já está tocando");
		}
	}

	@Override
	public void pause() {
		if(!this.isLigado()) {
			System.out.println("TV desligada");
		}
		else if(this.isTocando()) {
			this.setTocando(false);
			System.out.println("Pausado");
		}
		else {
			System.out.println("Já está pausado");
		}
	}
}
