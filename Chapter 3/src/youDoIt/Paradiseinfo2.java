package youDoIt;

import java.util.Scanner;

public class Paradiseinfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double price;
		double discount;
		double savings;
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.println("Enter cutoff price for discount >> ");
		price = keyboard.nextDouble();
		System.out.println("Enter discount rate as a whole number >> ");
		discount = keyboard.nextDouble(); 
		displayInfo(); 
		savings = computeDiscountInfo(price, discount); 
		System.out.println("Special this week on any service over" + price);
		System.out.println("Discount of " + discount + "percent");
		System.out.println("Thats a savings of at least $ " + savings);
		
				
	}

	private static double computeDiscountInfo(double price, double discount) {
		// TODO Auto-generated method stub
		double savings;  
		savings = price * discount / 100;
		return savings; 
	}

	private static void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Paradise Day Spa wants to pamper you. ");
		System.out.println("We will make make you look good. ");
	}

}
