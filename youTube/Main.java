package youTube;

public class Main {
	public static void main(String args[]) {
		// Intanciando 3 vídeos
		Video v[] = new Video[3];
		
		v[0] = new Video("Nome muito criativo");
		v[1] = new Video("Como fazer slime");
		v[2] = new Video("Eai galerinha do youtube, tudo beleza?");
		System.out.println(v[0].toString());
		
		// Instanciando 1 espectador
		Espectador viewer = new Espectador("Jamilton", 15, 'M', "JayFera");
		System.out.println(viewer.toString());
		
		// Instanciando 1 visualização feita pelo espectador "Jamilton" no vídeo de índice 0 "Nome muito criativo"
		Visualizacao visu = new Visualizacao(v[0], viewer);
		visu.avaliar();
		System.out.println(visu.toString());
	}
}
