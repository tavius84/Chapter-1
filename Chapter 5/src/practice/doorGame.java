package practice;

import java.util.Scanner;

public class doorGame {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int doorChoice;
		String result;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the amazing door choice game!");
		System.out.println("Your host Steve Harvey");
		System.out.println("Pick a door any door. \n1- for door One\n2- for door Two\n3- for door Three"); 
		doorChoice = input.nextInt();
		
		
		if(doorChoice == 1)
		{
			result = "a used giftcard to mcdonalds";
		}
		else if(doorChoice == 2) 
		{ 
			result = "Batman sitting on a lawn chair";
		}

		
		else if(doorChoice == 3) {
		    result  = "Spoodermun";
		}
		
		else {
		     result = "nothing."; 
		}
		
		displayMessage(result);
		
	}
	public static void displayMessage(String result) {
		System.out.println("You won "+ result);
		
		}
}
