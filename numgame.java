import java.util.*;
public class numgame {

	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		
		int num1 = getInt(input, "Please enter the first number: ");
		int num2 = getInt(input, "Please enter the second number: ");
		int number1 = randomNum(num1, num2); 	
		System.out.println(number1);
		
		int num3 = guess(input, num1, num2);
		if (num3 == number1) {
		  
			System.out.println("Correct guess ");
		}else {
		
		System.out.println("The random number was: " + number1);
		}
	}

	private static int getInt(Scanner input, String prompt) {
		System.out.print(prompt);	
		while (!input.hasNextInt()) {
			input.next();
			System.out.println("Not an integer");
			System.out.print(prompt);	
		}
	   return input.nextInt();
	}
	
	
	
	private static int guess(Scanner input, int min, int max ) {
		
		int guess1 = getInt( input, "Please enter a number in your range: ");
	  
		while (guess1 <min || guess1 >= max) {
			System.out.println("Out of range ");	
			guess1 = getInt( input, "Please enter a number in your range:");
		}
		
		return guess1;
		
	}
   

	
	private static int randomNum(int min, int max) {
		
		Random rand = new Random();		
		int number = rand.nextInt(max);		
		int mid = min+number;
		
		if (number < min && max < mid) {	 
			number = randomNum(min, max);	
		 	 
		} else if 
			(number < min && max > mid) {
			number = mid;
			
		} else {			
		 number = min+ number;
		}
	return number;	
	}


}
	
	
	
	
	
	
	
	
