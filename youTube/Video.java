package youTube;

public class Video implements AcoesVideo{
	private String titulo;
	private int avalicacao;
	private int visualizacoes;
	private int curtidas;
	private boolean reproduzindo;
	
	public Video(String titulo) {
		this.setTitulo(titulo);
		this.setAvalicacao(0);
		this.setCurtidas(0);
		this.setVisualizacoes(0);
		this.setReproduzindo(false);
	}
	
	// Getters e Setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvalicacao() {
		return avalicacao;
	}
	public void setAvalicacao(int avaliacao) {
		if(this.getVisualizacoes() != 0) {
			int nova = (int) (this.getAvalicacao() + avaliacao) / this.getVisualizacoes();
			this.avalicacao = nova;
		}
		else this.avalicacao = avaliacao;
	}

	public int getVisualizacoes() {
		return visualizacoes;
	}
	public void setVisualizacoes(int visualizacoes) {
		this.visualizacoes = visualizacoes;
	}

	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	// Métodos Sobrescritos
	@Override
	public void play() {
		if(!this.isReproduzindo()) this.setReproduzindo(true);
	}

	@Override
	public void pause() {
		if(this.isReproduzindo()) this.setReproduzindo(false);
	}

	@Override
	public void like() {
		this.setCurtidas(this.getCurtidas() + 1);
	}

	@Override
	public String toString() {
		return "Título: " + this.getTitulo() + 
				"\nAvaliação: " + this.getAvalicacao() + 
				"\nCurtidas: " + this.getCurtidas() +
				"\nVisualizações: " + this.getVisualizacoes();
	}
}
