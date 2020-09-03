package aula07;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private int altura; // Em cm
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	// Métodos Especiais
	public Lutador(String nome, String nacionalidade, int idade, int altura, float peso, String categoria, int vitoria, int derrota, int empate) {
		this.setNome(nome);
		this.setNacionalidade(nacionalidade);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		this.setVitoria(vitoria);
		this.setDerrota(derrota);
		this.setEmpate(empate);
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setNacionalidade(String nacionalidade){
		this.nacionalidade = nacionalidade;
	}
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	public int getIdade() {
		return this.idade;
	}
	
	public void setAltura(int altura){
		this.altura = altura;
	}
	public int getAltura() {
		return this.altura;
	}
	
	public void setPeso(float peso){
		this.peso = peso;
		this.setCategoria();
	}
	public float getPeso() {
		return this.peso;
	}
	
	private void setCategoria(){
		if(this.getPeso() < 52.2) {
			this.categoria = "Inválido";
		} else if(this.getPeso() <= 70.3) {
			this.categoria = "Leve";
		} else if(this.getPeso() <= 83.9) {
			this.categoria = "Médio";
		} else if(this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}
	public String getCategoria() {
		return this.categoria;
	}
	
	public void setVitoria(int vitoria){
		this.vitorias = vitoria;
	}
	public int getVitoria() {
		return this.vitorias;
	}
	
	public void setDerrota(int derrota){
		this.derrotas = derrota;
	}
	public int getDerrota() {
		return this.derrotas;
	}
	
	public void setEmpate(int empate){
		this.empates = empate;
	}
	public int getEmpate() {
		return this.empates;
	}

	// Métodos
	
}
