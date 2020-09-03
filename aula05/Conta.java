package aula05;

public class Conta {
	public int numConta;
	protected String tipoConta;
	private String donoConta;
	private float saldo;
	private boolean aberta;
	
	public Conta(String tipoConta, String donoConta, int numConta) {
		this.setNumConta(numConta);
		this.setDonoConta(donoConta);
		this.setTipoConta(tipoConta);
		
		abrirConta(this.getTipoConta());
	}
	
	// Construtor
	public void abrirConta(String tipoConta) {
		if(tipoConta == "CC") {
			this.setSaldo(50);
		}
		else {
			this.setSaldo(150);
		}
		this.setAberta(true);
		System.out.println("Conta aberta com sucesso!");
	}
	
	// Métodos
	public void fecharConta() {
		if(this.getSaldo() > 0 || this.getSaldo() < 0) {
			System.out.println("Não é possível fechar uma conta com saldo não nulo.");
		}
		else {
			this.setAberta(false);
			System.out.println("Conta fechada com sucesso.");
		}
	}
	
	public void depositar(float valor) {
		if(this.isAberta()) {
			this.setSaldo(this.getSaldo()  + valor);
			System.out.println("Depósito realizado na conta de " + this.getDonoConta());
		}
		else {
			System.out.println("Conta não existe.");
		}
	}
	
	public float sacar(float valor) {
		if(this.isAberta() && saldo > valor) {
			return this.saldo - valor;
		}
		else if (!this.isAberta()){
			System.out.println("Conta não existe.");
			return (Float) null;
		}
		else {
			System.out.println("Valor maior que o saldo da conta.");
			return (Float) null;
		}
	}
	
	public void pagarMensalidade() {
		if(!this.isAberta()) {
			System.out.println("Conta não existe");
		}
		else if(this.getTipoConta() == "CC") {
			this.setSaldo(this.getSaldo() - 12);
			System.out.println("Mensalidade paga com sucesso!");
		}
		else {
			this.setSaldo(this.getSaldo() - 20);
			System.out.println("Mensalidade paga com sucesso!");
		}
	}
	
	// Getters e Setter
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	public String getTipoConta() {
		return this.tipoConta;
	}
	
	public void setDonoConta(String donoConta) {
		this.donoConta = donoConta;
	}
	
	public String getDonoConta() {
		return this.donoConta;
	}
	
	public void setSaldo(float Saldo) {
		this.saldo = Saldo;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	
	public boolean isAberta() {
		return this.aberta;
	}
	
	@Override
	public String toString() {
		return ("Conta: " + this.getNumConta() + 
				"\nDono: " + this.getDonoConta() + 
				"\nTipo: " + this.getTipoConta() +
				"\nSaldo: " + this.getSaldo() +
				"\nStatus: " + (this.isAberta()?"Aberta":"Fechada"));
	}
}
