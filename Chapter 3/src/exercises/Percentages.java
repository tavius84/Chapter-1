package exercises;

import java.util.Scanner;

public class Percentages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double x;
       double y;
       Scanner input  = new Scanner(System.in); 
       System.out.println(" Please enter an number >> ");
       x = input.nextDouble();
       
       System.out.println(" Please enter an number >> ");
       y = input.nextDouble();
       
       computePercent(x, y);
		
		
		
		
		
	}

	private static void computePercent(double x, double y) {
		// TODO Auto-generated method stub
		double compute;
		
		
		compute =(x / y) * 100;
		System.out.println(x + " divided by " + y +  " = " + compute + " % ");
		
		
	}

}
