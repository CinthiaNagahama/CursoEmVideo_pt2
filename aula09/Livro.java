package aula09;

public class Livro implements Publicacao{
	private String titulo;
	private String autor;
	private int totalPaginas;
	private int paginaAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro(String titulo, String autor, int total, Pessoa leitor) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setAberto(false);
		this.setPaginaAtual(0);
		this.setTotalPaginas(total);
		this.setLeitor(leitor);
	}
	
	// Getters e Setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotalPaginas() {
		return totalPaginas;
	}
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	public int getPaginaAtual() {
		return paginaAtual;
	}
	public void setPaginaAtual(int paginaAtual) {
		this.paginaAtual = paginaAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	// Métodos
	public String detalhes() {
		return "\n\n-------------------------------------------------------------\n" +
				"Título: " + this.getTitulo() + "\nAutor: " + this.getAutor() + "\nTotal de páginas: " + this.getTotalPaginas() +
				"\nLeitor: " + this.getLeitor().getNome() + ", idade: " + this.getLeitor().getIdade() + ", sexo: " + this.getLeitor().getSexo() +
				"\nPágina Atual: " + this.getPaginaAtual();
	}
	
	@Override
	public void abrir() {
		this.setAberto(true);
	}
	
	@Override
	public void fechar() {
		this.setAberto(false);
	}
	
	@Override
	public void folhear(int p) {
		if(p <= this.getTotalPaginas()) {
			this.setPaginaAtual(p);
		}
		else {
			System.out.println("\nO livro não tem tantas páginas assim.\n");
			this.setPaginaAtual(0);
		}
	}
	
	@Override
	public void avancarPagina() {
		if(this.getPaginaAtual() + 1 > this.getTotalPaginas()) {
			System.out.println("\nVocê terminou o livro!!!\n");
		}
		else {
			this.setPaginaAtual(this.getPaginaAtual() + 1);
		}
	}
	
	@Override
	public void voltarPagina() {
		if(this.getPaginaAtual() - 1 < 0) {
			System.out.println("\nVocê já está no começo do livro\n");
		}
		else {
			this.setPaginaAtual(this.getPaginaAtual() - 1);
		}
	}
}
