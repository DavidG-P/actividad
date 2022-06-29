package actividad;

import java.util.Date;

/**
 * Representa un equipo de futbol
 * 
 * @author David Galeano
 *
 */
public class SoccerTeam {
	/**
	 * Representa la variable nombre de un equipo
	 */
	public String name;
	/**
	 * Representa la variable ciudad a la que pertenece un equipo
	 */
	public String city;
	/**
	 * Represneta la variable estadio que tiene un equipo
	 */
	public String stadium;
	/**
	 * Representa la fecha de fundacion del equipo
	 */
	public Date foundationDate;
	/**
	 * Representa el presupuesto del equipo
	 */
	private double budget;

	/**
	 * Devuelve un nombre seleccionado
	 * 
	 * @return devuelve el valor almacenado en la variable name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Asigna un nombre ingresado
	 * 
	 * @param name recibe un valor y lo almacena en la variable name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Devuelve una ciudad seleccionada
	 * 
	 * @return devuelve el valor almacenado en la variable city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Asigna una ciudad ingresada
	 * 
	 * @param city recibe el valor y lo almacena en la variable city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Devuelve un estadio seleccionado
	 * 
	 * @return devuelve el valor almacenado en la variable stadium
	 */
	public String getStadium() {
		return stadium;
	}

	/**
	 * Asigna un estadio ingresado
	 * 
	 * @param stadium recible un valor y lo almacena en la variable stadium
	 */
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	/**
	 * Devuelve la fecha de fundacion seleccionada
	 * 
	 * @return devuelve el valor almacenado en la variable foundationDate
	 */
	public Date getFoundationDate() {
		return foundationDate;
	}

	/**
	 * Asigna una fecha de fundacion
	 * 
	 * @param foundationDate recibe un valor y lo almacena en la variable
	 *                       foundationDate
	 */
	public void setFoundationDate(Date foundationDate) {
		this.foundationDate = foundationDate;
	}

	/**
	 * Devuelve el presupuesto seleccionado
	 * 
	 * @return devuelve el valor almacenado en la variable budget
	 */
	private double getBudget() {
		return budget;
	}

	/**
	 * Asigna un presupuesto al equipo
	 * 
	 * @param budget recible un valor y lo almacena en la variable budget
	 */
	private void setBudget(double budget) {
		this.budget = budget;
	}

}
