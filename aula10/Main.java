package aula10;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Pedro", 12, 'M');
		Aluno p2 = new Aluno("Almir", 32, 'M');
		Professor p3 = new Professor("Perla", 59, "Matemática Avançada", 'F');
		Funcionario p4 = new Funcionario("Fernando", 22, "Vendas", 'M');
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}

}
