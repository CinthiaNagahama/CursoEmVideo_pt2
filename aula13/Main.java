package aula13;

public class Main {
	public static void main(String args[]) {
		Cachorro doguinhoCaramelo = new Cachorro();
		
		doguinhoCaramelo.setIdade(10);
		doguinhoCaramelo.setMembros(4);
		doguinhoCaramelo.setPeso(41.4);
		doguinhoCaramelo.setCorPelo("Caramelo");
		doguinhoCaramelo.setNome("Bruno");
		
		doguinhoCaramelo.reagir(false);
		doguinhoCaramelo.reagir(12);
		doguinhoCaramelo.reagir(doguinhoCaramelo.getNome());
		doguinhoCaramelo.reagir("Senta");
	}
}
