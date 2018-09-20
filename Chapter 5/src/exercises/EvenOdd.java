package exercises;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x;
        String result; 
        Scanner input = new Scanner(System.in);
        System.out.println("Please pick a integer");
		x = input.nextInt();
        
		if (0 == x%2) {
		 	result = " even";
		}
		else {
			result = " odd";
		}
		displayMessage(result);
	}

	private static void displayMessage(String result) {
		// TODO Auto-generated method stub
		System.out.println("here is your answer >>" + result); 
	}

}
