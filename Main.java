package b1_console_based_calculator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;

		try {
		// user will enter its first number
		System.out.print("Enter number 1: ");
		int no1 = scan.nextInt();
		//user will enter its second number
		System.out.print("Enter number 2: ");
		int no2 = scan.nextInt();
		
		//Ask user for 
		System.out.print("Enter a operator: ");
		String operator = scan.next();
		
		
		if(operator == "+" && operator == "-" && operator =="*" && operator == "/" ) {
		switch(operator) {
			case "+":
				result = no1 + no2;
				break;
			case "-":
				result = no1 - no2;
				break;
			case "*":
				result = no1 * no2;
				break;
			case "/":
				result = no1 / no2;
				break;
		}
			System.out.println("Result: " + result);
			
		}else {
			System.out.println("Wrong Input, Try again!");
		}
		
		
		}catch (Exception e) {
			System.out.println("Wrong Input, Try again!");
		}
		
	}
}


