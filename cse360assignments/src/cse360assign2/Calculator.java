/**Erik Gronseth
 *ID: 387
 *CSE 360 Assignment 2
 *The purpose for this assignment is to demonstrate how to use a version
 *control system such as Github when creating code and making changes over
 *time to pieces of the program being made.
 */

package cse360assign2;

public class Calculator {

	/**Calculator is designed to operate like a simple calculator with
	 * four main functions: addition, subtraction, multiplication and
	 * division. It can grab the total after any number of steps have been
	 * used, and it only works with integers. An additional function is
	 * used to print to the screen all the commands used until that point.
	 * A private variable history will keep track in each function.
	 *@author Erik Gronseth
	 *@version %I%, %G%
	 *@since 1.8.0_191
	 */
	
	private int total;
	private String history;
	
	public Calculator () {
		
		/**This is the constructor that sets total to 0 to begin.
		 * This ensures that any time you begin calculator again, it
		 * won't keep the value from the previous calculations.
		 * It also begins the history string here.
		 */
		total = 0;
		history = "0";
	}
	
	public int getTotal () {
		
		/**This function simply sends out the current value of total.
		 *@return The current total is sent out.
		 */
		return total;
	}
	
	public void add (int value) {
		
		/**This function takes an integer value and adds it directly to the
		 * current total.
		 *@value Added to the current total.
		 */
		total += value;
		history += " + " + value;
	}
	
	public void subtract (int value) {
		
		/**This function takes an integer value and subtracts it directly
		 * from the current total.
		 *@value Subtracted from the current total.
		 */
		total -= value;
		history += " - " + value;
	}
	
	public void multiply (int value) {
		
		/**This function takes an integer value and multiplies the current
		 * total by the value.
		 *@value Multiply current total by this number.
		 */
		total *= value;
		history += " * " + value;
	}
	
	public void divide (int value) {
		
		/**This function takes an integer value and divides the current
		 * total by that value. If the value is 0, though, the result
		 * will be 0 instead to prevent divide by zero errors.
		 * All results will be rounded down.
		 *@value Divide total by this number.
		 */
		if(value != 0) {
			total /= value;
			
		}
		else {
			total = 0;
		}
		history += " / " + value;
	}
	
	public String getHistory () {
		
		/**This function prints a list of every function performed to
		 * the screen, from the first up to this function. Each operation
		 * is represented by its proper symbol (+,-,*,/) and will start
		 * with the initial value of 0 and each value used in between
		 * function calls.
		 * @return The history string is sent out.
		 */
		return history;
	}
}