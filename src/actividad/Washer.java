package actividad;

/**
 * Representa una lavadora con algunas caracteristicas y funciones
 * 
 * @author David Galeano
 *
 */
public class Washer {
	/**
	 * Representa la variable marca
	 */
	public String mark;
	/**
	 * Representa la variable libra
	 */
	private int pound;
	/**
	 * Representa la variable precio
	 */
	private double price;
	/**
	 * Representa la variable encendido
	 */
	public boolean turnOn;
	/**
	 * Representa la variable apagado
	 */
	public boolean turnOff;
	/**
	 * Representa la variable lavar
	 */
	private boolean wash;
	/**
	 * Representa la variable secar
	 */
	private boolean dry;

	/**
	 * Devuelve la marca
	 * 
	 * @return devuelve el valor almacenado en la variable mark
	 */
	public String getMark() {
		return mark;
	}

	/**
	 * Asigna una marca ingresada
	 * 
	 * @param mark recibe un valor y lo almacena en la variable mark
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}

	/**
	 * Devuelve las libras
	 * 
	 * @return devuelve el valor almacenado en la variable pound
	 */
	public int getPound() {
		return pound;
	}

	/**
	 * Asigna la cantidad de libras ingresadas
	 * 
	 * @param pound recibe un valor y lo almacena en la variable pound
	 */
	public void setPound(int pound) {
		this.pound = pound;
	}

	/**
	 * Devuelve el precio
	 * 
	 * @return devuelve el valor almacenado en la variable price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Asigna el precio ingresado
	 * 
	 * @param price recibe un valor y lo almacena en la variable price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Devuelve el estado activo o encendido
	 * 
	 * @return devuelve el valor almacenado en la variable turnOn
	 */
	public boolean isTurnOn() {
		return turnOn;
	}

	/**
	 * Asigna el estado de encendido
	 * 
	 * @param turnOn recibe un valor y lo almacena en la variable turnOn
	 */
	public void setTurnOn(boolean turnOn) {
		this.turnOn = turnOn;
	}

	/**
	 * Devuelve el estado inactivo o apagado
	 * 
	 * @return devuelve el valor almacenado en la variable turnOff
	 */
	public boolean isTurnOff() {
		return turnOff;
	}

	/**
	 * Asigna el estado de apagado
	 * 
	 * @param turnOff recibe un valor y lo almacena en la variable turnOff
	 */
	public void setTurnOff(boolean turnOff) {
		this.turnOff = turnOff;
	}

	/**
	 * Devuelve el estado de lavar
	 * 
	 * @return devuelve el valor almacenado en la variable wash
	 */
	public boolean isWash() {
		return wash;
	}

	/**
	 * Asigna el estado de lavado
	 * 
	 * @param wash recibe un valor y lo almacena en la variable wash
	 */
	public void setWash(boolean wash) {
		this.wash = wash;
	}

	/**
	 * Devuelve el estado de secar
	 * 
	 * @return devuelve el valor almacenado en la variable dry
	 */
	public boolean isDry() {
		return dry;
	}

	/**
	 * Asigna el estado de secar
	 * 
	 * @param dry recibe un valor y lo almacena en la variable dry
	 */
	public void setDry(boolean dry) {
		this.dry = dry;
	}



	
}
