package aula09;

import util.DataPadraoBrasil;

public class Main {
	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		DataPadraoBrasil d = new DataPadraoBrasil("19", "09", "1998");
		p[0] = new Pessoa("Pedro", d, "Masculino");
		
		d = new DataPadraoBrasil("03", "09", "1995");
		p[1] = new Pessoa("Maria", d, "Feminino");
		
		
		l[0] = new Livro("Harry Potter e o Prisioneiro de Azkaban", "J. K. Rowling", 200, p[0]);
		l[1] = new Livro("POO com JAVA", "Gustavo Guanabara", 590, p[1]);
		l[2] = new Livro("Qualquer Coisa que Vier a Sua Mente", "Cinthia Ungefehr", 109, p[1]);
		
		for(Livro livro : l) {
			System.out.println(livro.detalhes());
		}
	}
}