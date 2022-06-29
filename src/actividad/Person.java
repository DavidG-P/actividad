package actividad;

import java.util.Date;

/**
 * Representa a una persona y alguna de sus caracteristicas
 * 
 * @author David Galeano
 *
 */
class Person {

	/**
	 * Representa a la variable nombre
	 */
	public String name;
	/**
	 * Representa a la variable primer apellido
	 */
	public String lastName1;
	/**
	 * Representa a la variable segundo apellido
	 */
	public String lasName2;
	/**
	 * Representa a la fecha de nacimiento
	 */
	public Date datebirth;
	/**
	 * Representa a la estatura
	 */
	public float height;

	/**
	 * Devuelve un nombre
	 * 
	 * @return devuelve el valor almacenado en la variable name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Asigna un nombre
	 * 
	 * @param name recibe un valor y lo almacena en la variable name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Devuelve el primer apellido
	 * 
	 * @return devuelve el valor almacenado en la variable lastName1
	 */
	public String getLastName1() {
		return lastName1;
	}

	/**
	 * Asigna el primer apellido
	 * 
	 * @param lastName1 recibe un valor y lo almacena en la variable lastName1
	 */
	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}

	/**
	 * Devuelve el segundo apellido
	 * 
	 * @return devuelve el valor almacenado en la variable lastName2
	 */
	public String getLasName2() {
		return lasName2;
	}

	/**
	 * Asigna el segundo apellido
	 * 
	 * @param lastName2 recibe un valor y lo almacena en la variable lastName2
	 */
	public void setLasName2(String lasName2) {
		this.lasName2 = lasName2;
	}

	/**
	 * Devuelve la fecha de nacimiento
	 * 
	 * @return devuelve el valor almacenado en la variable datebirth
	 */
	public Date getDatebirth() {
		return datebirth;
	}

	/**
	 * Asigna la fecha de nacimiento
	 * 
	 * @param datebirth recibe un valor y lo almacena en la variable datebirth
	 */
	public void setDatebirth(Date datebirth) {
		this.datebirth = datebirth;
	}

	/**
	 * Devuelve la estatura
	 * 
	 * @return devuelve el valor almacenado en la variable height
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * Asigna la estatura
	 * 
	 * @param height recibe un valor y lo almacena en la variable height
	 */
	public void setHeight(float height) {
		this.height = height;
	}

}
