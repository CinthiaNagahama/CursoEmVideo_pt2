package youTube;

public class Main {
	public static void main(String args[]) {
		Video v[] = new Video[3];
		
		v[0] = new Video("Aprendendo JAVA");
		v[1] = new Video("Como fazer slime");
		v[2] = new Video("Eai galerinha do youtube, tudo beleza?");
		System.out.println(v[0].toString());
		
		Espectador viewer = new Espectador("Jamilton", 15, 'M', "JayFera");
		System.out.println(viewer.toString());
		
		Visualizacao visu = new Visualizacao(v[0], viewer);
		visu.avaliar();
		System.out.println(visu.toString());
	}
}
