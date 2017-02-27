package pkg;

import java.util.Scanner;


public class TuitionCal {

	public static void main(String[] args) {
		
	Scanner UI = new Scanner(System.in);
	
	System.out.println("What is your initial tuition?");
	double INT = UI.nextDouble();
	double Total = INT;
	
	System.out.println("What is the increase rate?");
	double ICR = UI.nextDouble()/100;
	
	for (int year = 1; year < 4; year++) {
		INT = Math.pow(INT, (1 + ICR));
		Total += INT;
	}
	
	System.out.printf("Your total tuition of four years is: $%.2f", Total);
	
	}
}
