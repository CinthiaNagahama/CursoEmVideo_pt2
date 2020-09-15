package aula09;

import java.util.Calendar;
import util.DataPadraoBrasil;

public class Pessoa {
	private String nome;
	private int idade;
	private DataPadraoBrasil dataNascimento;
	private String sexo;
	
	public Pessoa(String nome, DataPadraoBrasil dn, String sexo) {
		this.setNome(nome);
		this.setDataNascimento(dn);
		this.setSexo(sexo);
	}
	
	// Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	private void setIdade() {
		Calendar c = Calendar.getInstance();
		int idade = 0;
		
		if((c.get(Calendar.MONTH) + 1) > Integer.parseInt(this.getDataNascimento().getMes())) {
			idade = c.get(Calendar.YEAR) - Integer.parseInt(this.getDataNascimento().getAno());
		} 
		else if ((c.get(Calendar.MONTH) + 1) < Integer.parseInt(this.getDataNascimento().getMes())) {
			idade = c.get(Calendar.YEAR) - Integer.parseInt(this.getDataNascimento().getAno()) - 1;
		} 
		else if(c.get(Calendar.DAY_OF_MONTH) > Integer.parseInt(this.getDataNascimento().getDia())){
			idade = c.get(Calendar.YEAR) - Integer.parseInt(this.getDataNascimento().getAno());
		}
		else if(c.get(Calendar.DAY_OF_MONTH) == Integer.parseInt(this.getDataNascimento().getDia())) {
			System.out.println("\nFeliz Aniversário, " + this.getNome() + "!!!\n");
			idade =  c.get(Calendar.YEAR) - Integer.parseInt(this.getDataNascimento().getAno());
		}
		else {
			idade = c.get(Calendar.YEAR) - Integer.parseInt(this.getDataNascimento().getAno()) - 1;
		}

		this.idade = idade;
	}
	
	public DataPadraoBrasil getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(DataPadraoBrasil dataNascimento) {
		this.dataNascimento = dataNascimento;
		this.setIdade();
	}
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
