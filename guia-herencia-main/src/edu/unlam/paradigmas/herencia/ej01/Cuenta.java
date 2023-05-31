package edu.unlam.paradigmas.herencia.ej01;

public class Cuenta {
	private double saldo;

	public Cuenta() {
		super();
		this.saldo = 0;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + "]";
	}

	public void depositarSaldo(double saldo) throws MiException {
		if (saldo < 0) {
			throw new MiException("No se puede acreditar un saldo negativo");
		}
		this.saldo += saldo;
	}

	public void retirarSaldo(double saldo) throws MiException {

		if (saldo > this.saldo) {
			throw new MiException("No se puede retirar mas saldo del que hay en cuenta");
		}
		if(saldo<0) {
			throw new MiException("No se puede retirar un saldo negativo");
		}
		this.saldo -= saldo;

	}
	
	
	public void transferir(double saldo, Cuenta destino) throws MiException {
		this.retirarSaldo(saldo);
		destino.depositarSaldo(saldo);
	}
	

}
