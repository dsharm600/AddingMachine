 /*
 * Author: Dhiraj Sharma
 * Class ID: 85141
 * Assignment #: Assignment#2
 * Description: This class implements various methods that perform 
 * subtraction and addition operations and return a string showing
 * the calculation.
 */
package cse360assign2;
/**
 * Class to calculate using add or subtract method
 * and also prints the total and the string to show 
 * calculations.
 * 
 * @param total this integer stores the total value
 * of calulations.
 */
public class AddingMachine {
	
	
	private int total;		// Int to store the total value
	private String history; // String to store the history
	
	/**
     * Constructor
     * initialize total and history to 0
     */
	public AddingMachine () {
		
		total = 0;  // not needed - included for clarity
		history = "0"; //initialize history string to value 0.
	}
	
	/**
     * Gets the current total value.
     * 
     * @return the current total value;
     */
	public int getTotal () {
		
		return total;
	}
	
	/**
     * Adds the given value to string history
     * and the total.
     * 
     * @param value a value to add to string
     */
	public void add (int value) {
		
		total += value;				// adds the given value to total 
		history += " + " + value ;	// updates the history with the given value
	}
	
	/**
     * Subtracts the given value from string history
     * and the total.
     * 
     * @param value a value to subtract from string 
     */
	public void subtract (int value) {
		
		total -= value;				// subtracts the given value from total				
		history += " - " + value ;	// updates the history with the given value
	}
	
	/**
	 * This method returns the history of calculations
	 * performed.
	 * 
     * @return 	the string history showing the calculations
     */		
	public String toString () {
		
		return history;
	}
	
	/**
     * Method to clear the history and total.
     */	
	public void clear() {
	
		total = 0;			// set total and history to initial values.
		history = "0";
	}
}
