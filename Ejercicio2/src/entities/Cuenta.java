package entities;

public class Cuenta {

	/*
	 *Variables de la clase Cuenta obtenido de los constructores de Cuenta de la Clase "TestBanco",además de instanciar un objeto "cliente" */
	private int numeroCuenta;
	private int saldo;
	private Cliente cliente;
	/*Constructor no parametrizado de la clase Cuenta*/

	public Cuenta() {
		
	}
	/*Constructor parametrizado en el orden que se nos muestra en el constructor de la Clase "TestBanco" y en el que añadimos el objeto cliente
	 * tal y como aparece en el constructor de cuenta de la Clase "TestBanco" */
	public Cuenta(int numeroCuenta, int saldo, Cliente cliente) {
		
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}
	/*Getters y Setters de las variables de la Clase Cliente */
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
