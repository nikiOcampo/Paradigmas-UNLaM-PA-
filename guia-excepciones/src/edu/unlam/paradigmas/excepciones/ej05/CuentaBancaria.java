package edu.unlam.paradigmas.excepciones.ej05;

public class CuentaBancaria{
	
	private double saldo;
	private String titular;
	private int cuenta;
	
	
	
	public double getSaldo() {
		return saldo;
	}
	public String getTitular() {
		return titular;
	}
	public int getCuenta() {
		return cuenta;
	}
	public void setSaldo(double saldo) throws excepcionCuentaBancaria {
		this.saldo = saldo;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}
	
	
	public CuentaBancaria(double saldo, String titular, int cuenta) throws Exception {
		super();
		try {
			if(saldo<0) {
				throw new excepcionCuentaBancaria(1);
			}
		}catch(excepcionCuentaBancaria e) {
			System.out.println(e.getMessage());
		}
		this.saldo = saldo;
		this.titular = titular;
		this.cuenta = cuenta;
	}
	
	
	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + ", titular=" + titular + ", cuenta=" + cuenta + "]";
	}
	
	public void retiro(double cantidad) throws excepcionCuentaBancaria {
		
		if(cantidad<0) {
			throw new excepcionCuentaBancaria(2);
		}else if( this.saldo-cantidad<0) {
			throw new excepcionCuentaBancaria(3);
		}else {
			this.saldo-=cantidad;
		}
	}
	
	public void deposito(double cantidad) throws excepcionCuentaBancaria {
		
		try {
			if(cantidad<0) {
				throw new excepcionCuentaBancaria(2);
			}
		}catch(excepcionCuentaBancaria e) {
			System.out.println(e.getMessage());
		}
		
		this.saldo+=cantidad;
		
		
	}
	
	
	
	
	
}
