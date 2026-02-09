package cuentas;

/**Clase que representa una cuenta bancaria.
 * @author Andrés Gómez
 */

public class CCuenta {

	/* Nombre del titular */
	private String nombre;

	/* Número de cuenta */
	private String cuenta;

	/* Saldo actual */
	private double saldo;

	/* Tipo de interés */
	private double tipoInterés;

	/* Constructor por defecto */
	public CCuenta() {
	}

	/** Constructor con parámetros
	 * 
	 * @param nombre Nombre del titular
	 * 
	 * @param cuenta Número de cuenta
	 * 
	 * @param saldo Saldo inicial
	 * 
	 * @param tipoInteres Tipo de interés
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}

	// Getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Devuelve el saldo actual
	 * 
	 * @return saldo
	 */
	public double estado() {
		return saldo;
	}

	/**
	 * Ingresa una cantidad en la cuenta
	 * 
	 * @param cantidad Cantidad a ingresar
	 * @throws Exception si la cantidad es negativa
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}

	/**
	 * Retira una cantidad de la cuenta
	 * 
	 * @param cantidad Cantidad a retirar
	 * @throws Exception si la cantidad es incorrecta o no hay saldo
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}
}
