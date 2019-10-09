//Brandon O'Bier
//bobier@asu.edu
//1212985382
//https://github.com/tripwire98/AddingMachine

package cse360assign2;

public class AddingMachine {
		
		private int total;
		private String history;
		
		
		//Used for testing ************************************************************
		public static void main(String[] args) {
			AddingMachine myCalculator = new AddingMachine();
			
			myCalculator.add(4);
			System.out.println(myCalculator.toString());
			System.out.println(myCalculator.getTotal());
			
			myCalculator.subtract(2);
			System.out.println(myCalculator.toString());
			System.out.println(myCalculator.getTotal());
			
			myCalculator.add(5);
			System.out.println(myCalculator.toString());
			System.out.println(myCalculator.getTotal());

			myCalculator.subtract(2);
			System.out.println(myCalculator.toString());
			System.out.println(myCalculator.getTotal());
			
			myCalculator.subtract(3);
			System.out.println(myCalculator.toString());
			System.out.println(myCalculator.getTotal());
			
			myCalculator.add(10);
			System.out.println(myCalculator.toString());
			System.out.println(myCalculator.getTotal());
		}
		//*******************************************************************************
		
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