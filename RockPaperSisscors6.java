package Practice;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class RockPaperSisscors6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	    String personsMove;
	    String computersMove = "";
	    int computerInt;
	    int count = 0;
	    int choice;
	    String result = "";
	    Scanner scan = new Scanner (System.in);
	    Random generator = new Random();
	   
	    do {
	    System.out.println("Hey, let's play Rock, Paper, Scissors!" + 
	            "Please enter a move." + "Rock = R, Paper" + 
	            "= P, and Scissors = S.");
	    computerInt = generator.nextInt(3)+1;
	        if (computerInt == 1) {
		       computersMove = "R";} 
		    else if (computerInt == 2) {
		       computersMove = "P"; }
		    else if (computerInt == 3) { 
		       computersMove = "S"; }
	        System.out.println("Enter your move >> "); 
			personsMove = scan.next();
			personsMove = personsMove.toUpperCase(); 
			System.out.println("the computer's move is >> " + computersMove); 
			if (personsMove.equals(computersMove)) { 
			       System.out.println("It's a tie"); }
			    else if (personsMove.equals("R")) {
			       if (computersMove.equals("S")) { 
			          System.out.println("Rock crushes scissors. You won");
			          count = count + 1;}
			       }
			    else if (computersMove.equals("P")) { 
			            System.out.println("Paper eats rock. You lost"); }
			    else if (personsMove.equals("P")) { 
			       if (computersMove.equals("S")) {
			       System.out.println("Scissor cuts paper. You lost");} 
			       } 
			    else if (computersMove.equals("R")) {
			            System.out.println("Paper eats rock. You won");
			            count = count + 1;}
			    else if (personsMove.equals("S")) { 
			         if (computersMove.equals("P")) {  
			         System.out.println("Scissor cuts paper. You won"); }
			         count = count + 1;}
			    else if (computersMove.equals("R")) {
			            System.out.println("Rock breaks scissors. You lost");} 
			    else 
			         System.out.println("Really thats not a Choice... "); 
			
			System.out.println("\n Did you win?\n" + result + "\nNumber of wins: " + count);
			choice = Integer.parseInt(JOptionPane.showInputDialog(null , "Would you like to play again, 999 is to quit."));
	    }while(count !=999);
	    }
	
}
