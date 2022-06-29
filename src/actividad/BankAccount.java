package actividad;

/**
 * Representa una cuenta bancaria
 * 
 * @author David Galeano
 *
 */
public class BankAccount {
	/**
	 * Representa la variable numero de cuenta
	 */
	private int accountNumber;
	/**
	 * Representa la variable activada o estado activo de la cuenta
	 */
	protected boolean activated;

	/**
	 * Asigna un estado de actividad a la cuenta
	 * 
	 * @param activated recibe un valor y lo almacena en la variable activated
	 */
	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	/**
	 * Devuelve un estado de actividad
	 * 
	 * @return devuelve el valor almacenado en la variable activated
	 */
	public boolean getActivated() {
		return activated;
	}

	/**
	 * Devuelve un numero de cuenta
	 * 
	 * @return devuelve el valor almacenado en la variable accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * Asigna un numero de cuenta
	 * 
	 * @param accountNumber recibe un valor y lo almacena en la variable
	 *                      accountNumber
	 * 
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

}