package aula11;

public class Main {

	public static void main(String[] args) {
		Aluno a = new Aluno("Almir", 32, 'M');
		Professor p = new Professor("Perla", 59, "Matemática Avançada", 'F');
		
		System.out.println(a.toString());
		System.out.println(p.toString());
	}

}
