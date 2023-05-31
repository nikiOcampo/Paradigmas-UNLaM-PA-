package edu.unlam.paradigmas.herencia.ej01;

public class CuentaAhorro extends Cuenta {
	private double saldoSecundario;

	public double getSaldoSecundario() {
		return saldoSecundario;
	}

	public void setSaldoSecundario(double saldoSecundario) {
		this.saldoSecundario = saldoSecundario;
	}

	public CuentaAhorro() {
		super();
	}

	@Override
	public String toString() {
		return super.toString()+"Ahorro [saldoSecundario=" + saldoSecundario + "]";
	}

	
	public void reservarSaldo(double saldoAReservar) throws MiException {
		super.retirarSaldo(saldoAReservar);
		this.saldoSecundario=saldoAReservar;
	}
	
	public void reintegrarSaldo(double saldoAReintegrar) throws MiException {
		if(saldoAReintegrar>this.saldoSecundario) {
			throw new MiException("No puedes reintegrar mas dinero del que tienes reservado");
		}
		if(saldoAReintegrar<0) {
			throw new MiException("No puedes reintegrar dinero negativo");
		}
		super.depositarSaldo(saldoAReintegrar);
		this.saldoSecundario-=saldoAReintegrar;
	}
	
}
