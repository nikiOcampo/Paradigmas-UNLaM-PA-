package edu.unlam.paradigmas.herencia.ej01;

public class CuentaCorriente extends Cuenta {
	private double descubierto;

	public CuentaCorriente(double descubierto) {
		super();
		this.descubierto = descubierto;
	}
	
	
	
	
	@Override
	public String toString() {
		return super.toString() + "CuentaCorriente [descubierto=" + descubierto + "]";
	}



	@Override
	public void retirarSaldo(double saldo) throws MiException {
		if(saldo>super.getSaldo() + descubierto) {
			throw new MiException("No puedes retirar mas saldo del descubierto ya dado");
		}
		super.depositarSaldo(descubierto);
		super.retirarSaldo(saldo);
		this.descubierto-=descubierto - super.getSaldo();
		super.setSaldo(0);
	}
}
