package testeDesafio;

public class ContaBancaria {
	
	private int numero;
	private double saldo;
	
	public ContaBancaria (int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void emiteExtrato() {
		System.out.println("Saldo total de: ");
	}

	public double creditar (double credito) {
		saldo = saldo + credito;
		return this.saldo;
	}
	
	public double debitar (double debito) {
		saldo = saldo - debito;
		return this.saldo;
	}
	
	public boolean podeSacar(double valor) {
		
		if((saldo - valor)>=0) {
			 saldo -= valor; 
			return true;
			
		}
		else{
			return false;
			
		}
	
	}

}

