package testeDesafio;

public class ContaPoupanca extends ContaBancaria {
	
	private double juros;
	private double corrMonetaria = 0.01 ;
	private int mesAniversario;

	public ContaPoupanca (int numero, double saldo, double juros, double corrMonetaria, int mesAniversario) {
		super(numero, saldo);
		this.juros = juros;
		this.corrMonetaria = corrMonetaria;
		this.mesAniversario = mesAniversario;
	}
	
	public double calcularJurosPoup () {
		return super.creditar(super.getSaldo() * 0.01);
	}
	
	public double aniversarioMes () {
		int mesAni = 0;
		if (mesAniversario == mesAni) {
			super.creditar (super.getSaldo()*corrMonetaria);
		}
	return super.getSaldo();	
	}
	
}
