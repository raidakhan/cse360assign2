package cse360assign2;

/**
*
* @author Raida Khan
* @classID 85141
* @assignmentnumber 2
* 
*                   This file contains the AddingMachine class with one constructor and 5 methods, 
*                   including a toString() method, with the purpose of performing addition/subtraction 
*                   operations. At this time, most of the methods are empty.
* 
* 
*/

/**
 * AddingMachine class contains one unparameterized constructor and 5 additional
 * methods, including the toString() method
 *
 */

public class AddingMachine {

	private int total;
	private String str = "0"; // keeps track of the string concatenation

	/**
	 * Default class constructor takes in no parameters and initializes the private
	 * variable 'total'
	 *
	 */

	public AddingMachine() {
		total = 0; // not needed - included for clarity
	}

	/**
	 * getTotal method which returns the total of all the operations performed
	 * 
	 * @return integer value for total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * add(int value) method that takes in an integer value and adds it to the total.
	 * method does not return anything but concatenates value to str variable (used
	 * in toString method)
	 */
	public void add(int value) {
		total += value;
		str = str + " + " + Integer.toString(value);

	}

	/**
	 * subtract(int value) method that takes in an integer value and subtracts it from
	 * the total. method does not return anything but concatenates value to str
	 * variable (used in toString method)
	 */
	public void subtract(int value) {
		total -= value;

		str = str + " - " + Integer.toString(value);

	}

	/**
	 * toString() method that returns a string value
	 * 
	 * @return a String value with a history of the operations performed
	 */
	public String toString() {
		return str;

	}

	/**
	 * clear() method that clears the total. functionality not specified in the
	 * assignment instructions.
	 *
	 */
	public void clear() {
		total = 0;
	}
}
