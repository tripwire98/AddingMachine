//Brandon O'Bier
//bobier@asu.edu
//1212985382
//class ID (85141)
//https://github.com/tripwire98/AddingMachine.git

package cse360assign3;

public class AddingMachine {
		
		protected int total;
		protected String history;
		
		public AddingMachine() {
			total = 0;  // not needed - included for clarity
			history = "0";

		}
		
		public int getTotal () {
			return total;
		}
		
		public void add (int value) {
			// adds the value from total then send info to history
			total = total + value;
			history = history + " + " + value;
		}
		
		public void subtract (int value) {
			// Subtracts the value from total then send info to history
			total = total - value;
			history = history + " - " + value;
		}
		
		public String toString () {
			//Displays the history
			return history;
		}
		
		public void clear() {
			//resets the history and the total
			history = "0"; 
			total = 0;
		}
		
}