package edu.unlam.paradigmas.excepciones.ej04;

public class CuentaBancaria {
	
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
	public void setSaldo(double saldo) throws Exception {
		if(saldo<0) {
			throw new Exception();
		}
		this.saldo = saldo;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}
	
	
	public CuentaBancaria(double saldo, String titular, int cuenta) {
		super();
		this.saldo = saldo;
		this.titular = titular;
		this.cuenta = cuenta;
	}
	
	
	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + ", titular=" + titular + ", cuenta=" + cuenta + "]";
	}
	
	public void retiro(double cantidad) throws Exception {
		if(this.saldo-cantidad<0) {
			throw new Exception();
		}else {
			this.saldo-=cantidad;
		}
	}
	
	
	
	
	
}
