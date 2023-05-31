package edu.unlam.paradigmas.excepciones.ej05;

public class excepcionCuentaBancaria extends Exception{
	private static final long serialVersionUID=1L;
	private int codigo;
	
	
	public excepcionCuentaBancaria(int codigo) {
		super();
		this.codigo = codigo;
	}
	
	
	public excepcionCuentaBancaria(String mensaje) {
		super(mensaje);
	}
	

	@Override
	public String getMessage() {
		switch (codigo) {
		case 1:
			return "El saldo no puede ser negativo";
		case 2:
			return "Esta depositando o retirando una cantidad negativa";
		case 3:
			return "Esta retirando mas plata que la contenida en su saldo";
		}
		return super.getMessage();
	}
	
	
}
