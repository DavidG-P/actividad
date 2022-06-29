package actividad;

/**
 * Representa un producto y algunas caracteristicas
 * 
 * @author David Galeano
 *
 */
public class Product {

	/**
	 * Representa la variable de un identificador unico
	 */
	protected int id;
	/**
	 * Representa la variable del nombre de un producto
	 */
	public String name;
	/**
	 * Representa la variable del precio de un producto
	 */
	private double price;

	/**
	 * Devuelve un id seleccionado
	 * 
	 * @return devuelve el id almacenado en la variable id
	 * 
	 */
	protected int getId() {
		return id;
	}

	/**
	 * Asigna un id ingresado
	 * 
	 * @param id recibe un valor y lo almacena en la variable id
	 */
	protected void setId(int id) {
		this.id = id;
	}

	/**
	 * Devuelve un nombre seleccionado
	 * 
	 * @return devuelve un nombre almacenado en la variable name
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
	 * Devuelve un precio seleccionado
	 * 
	 * @return devulve el precio almacenado en la variable price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Asigna un precio ingresado
	 * 
	 * @param price recibe un precio y lo almacena en la variable price
	 */
	public void setPrice(double price) {
		this.price = price;

	}

}
