package entities;

public class Cliente {

	/*
	 *Variables de la clase Cliente obtenido de los constructores de Cliente de la Clase "TestBanco" */
	
	private String dni;
	private String nombre;
	private String saldo;
	private int cosa =1;
	
	/*Constructor no parametrizado de la clase Cliente*/

	public Cliente() {
		
	}
	/*Constructor parametrizado en el orden que se nos muestra en el constructor de la Clase "TestBanco" */
	public Cliente(String dni, String nombre, String saldo) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	/*Getters y Setters de las variables de la Clase Cliente */
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSaldo() {
		return saldo;
	}
	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}


}
