package exercises;

import java.util.Scanner;

public class Testlbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in); 
		double lbs; 
		
 		
 		System.out.println("How much do you weigh in pounds?  ");
 		lbs = input.nextDouble(); 
 		
 		displayConversionToOunces(lbs);
 		displayConversionToKilograms(lbs); 
		displayConversionToMilligrams(lbs);
		
		
		
	}

	private static void displayConversionToOunces(double lbs) {
		// TODO Auto-generated method stub
		
		double lbsToOunces;
		lbsToOunces =  lbs* 16;
		 
		 
		 System.out.println("Your weight in Ounces >> " + lbsToOunces);
	}

	private static void displayConversionToKilograms(double lbs) {
		// TODO Auto-generated method stub
		double lbsToKilograms;
		
		lbsToKilograms = lbs * 2.2046226218;
		
		 System.out.println("Your weight in Kilograms >> " + lbsToKilograms);
		
	}

	private static void displayConversionToMilligrams(double lbs) {
		// TODO Auto-generated method stub
		 double lbsToMilligrams; 
		
		 lbsToMilligrams = lbs * 0.45359237; 
		 
		 System.out.println("Your weight in Milligrams >> " + lbsToMilligrams);
		 
	}

}
