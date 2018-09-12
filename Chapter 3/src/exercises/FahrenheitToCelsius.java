package exercises;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner input = new Scanner(System.in); 
    	 double ftemp;
    	 double ftemp1;
    	 double ftemp2;
         System.out.println("what is the temp at 8 am ? "); 
         ftemp = input.nextDouble();  
	     System.out.println("What is the temp at 12pm ? ");
	     ftemp1 = input.nextDouble();
		 System.out.println("What is the temp at 5pm ? ");
		 ftemp2 = input.nextDouble();
		
		displayInfo(ftemp); 
		displayInfo(ftemp1);
		displayInfo(ftemp2);
	}

	private static void displayInfo(double ftemp) {
		// TODO Auto-generated method stub
		double Celsius;
		Celsius =  (ftemp-32)/1.8; 
		System.out.println("The temp in Celsius at 8:00am is " + Celsius); 
	}

}
