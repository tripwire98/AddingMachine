//Brandon O'Bier
//bobier@asu.edu
//1212985382
//class ID (85141)
//https://github.com/tripwire98/AddingMachine.git

package cse360assign3;

public class Calculator extends AddingMachine {
	
	//Used for testing ************************************************************
			public static void main(String[] args) {
				Calculator myCalculator = new Calculator();
				
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
				
				myCalculator.Power(2);
				System.out.println(myCalculator.toString());
				System.out.println(myCalculator.getTotal());
				
				myCalculator.divide(12);
				System.out.println(myCalculator.toString());
				System.out.println(myCalculator.getTotal());
				
				myCalculator.multiply(4);
				System.out.println(myCalculator.toString());
				System.out.println(myCalculator.getTotal());
				
				myCalculator.divide(0);
				System.out.println(myCalculator.toString());
				System.out.println(myCalculator.getTotal());
				
				myCalculator.add(10);
				System.out.println(myCalculator.toString());
				System.out.println(myCalculator.getTotal());
				
				myCalculator.multiply(4);
				System.out.println(myCalculator.toString());
				System.out.println(myCalculator.getTotal());
				
				myCalculator.Power(-2);
				System.out.println(myCalculator.toString());
				System.out.println(myCalculator.getTotal());
			}
			//*******************************************************************************
	
	public void multiply (int value) {
	       
		total = total * value;
		history = history + " * " + value;

	}
	  
	public void divide (int value) {
		
		if(value == 0) {
			
			total = 0;
			history = history + " / " + value;
			
		}else{
			
			total = total / value;
			history = history + " / " + value;

		}
	}
	
	public void Power (int value) {
		
		if(value < 0) {
			
			total = 0;
			history = history + " ^ " + value;
			
		}else {
			
			total = (int) Math.pow(total, value);
			history = history + " ^ " + value;
		}
		
	}
}
