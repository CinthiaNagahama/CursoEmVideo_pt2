package youTube;

public class Visualizacao {
	private Video video;
	private Espectador espec;
	
	public Visualizacao(Video video, Espectador espec) {
		this.setVideo(video);
		this.setEspec(espec);
		
		this.getEspec().setTotalAssistido(this.getEspec().getTotalAssistido() + 1);
		this.getVideo().setVisualizacoes(this.getVideo().getVisualizacoes() + 1);
	}
	
	// Getters e Setters
	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}
	public Espectador getEspec() {
		return espec;
	}
	public void setEspec(Espectador espec) {
		this.espec = espec;
	}
	
	// Métodos Sobrescritos
	@Override
	public String toString() {
		return "\n---------------------------------Vídeo-----------------------------------\n" +
				this.getVideo() +
				"\n------------------------------Espectador---------------------------------\n" +
				this.getEspec();
	}
	
	// Métodos
	public void avaliar() {
		this.getVideo().setAvalicacao(5);
	}
	public void avaliar(int nota) {
		this.getVideo().setAvalicacao(nota);
	}
}
