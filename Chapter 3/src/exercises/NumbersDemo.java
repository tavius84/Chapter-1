package exercises;

import java.util.Scanner;

public class NumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int X = 5; 
        int Y = 12;  
		Scanner Scanner = new Scanner (System.in); 
				
        displayTwiceNumber(X, Y); 
		
		displayNumberPlusFive(X, Y); 
		
		displayNumberSquared(X, Y); 
		
	}

	private static void displayNumberSquared(int X, int Y) {
		// TODO Auto-generated method stub
		
		int X4;
		int Y4;
		
		X4 = X * X;
		Y4 = Y * Y; 
		System.out.println("x = " + X4 + " y = " + Y4);
		
	}

	private static void displayNumberPlusFive(int X, int Y) {
		// TODO Auto-generated method stub
		
		int X3;
		int Y3;
		
		X3 = X + 5;
		Y3 = Y + 5; 
		
		System.out.println("x = " + X3 + " y = " + Y3); 
	}

	private static void displayTwiceNumber(int X, int Y) {
		// TODO Auto-generated method stub
		int X2;
		int Y2; 
		X2 = X * 2;
		Y2 = Y * 2;
		System.out.println("x = " + X2 + " y = " + Y2); 
		
	}

}
