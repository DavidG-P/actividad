package actividad;

import java.util.ArrayList;

/**
 * Representa a una fruta y sus propiedades
 * 
 * @author David Galeano
 *
 */
public class Fruit {
	/**
	 * Representa la variable nombre
	 */
	public String name;
	/**
	 * Representa la variable peso promedio
	 */
	private float averageWeight;
	/**
	 * Representa la variable colores
	 */
	public ArrayList<String> colors;

	/**
	 * Asigna un nombre
	 * 
	 * @param name recibe un valor que se almacena en la variable name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Devuelve una lista de colores
	 * 
	 * @return devuelve el valor almacenado en la variable colors
	 */
	public ArrayList<String> getColors() {
		return colors;
	}

	/**
	 * Devuelve el peso promedio
	 * 
	 * @return devuelve el valor almacenado en la variable averageWeigth
	 */
	public float getAverageWeight() {
		return averageWeight;
	}

	/**
	 * Asigna el peso promedio
	 * 
	 * @param averageWeight recibe un valor que se almacena en la variable
	 *                      averageweight
	 */
	public void setAverageWeight(float averageWeight) {
		this.averageWeight = averageWeight;
	}

	/**
	 * Devuelve el nombre
	 * 
	 * @return devuelve el valor almacenado en la variable name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Asigna una lista de colores de tipo string
	 * 
	 * @param colors recibe un ArrayList de tipo String que se almacena en la
	 *               variable colors
	 */
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}

}
