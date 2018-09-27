package gameZone;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String personsMove;
    String computersMove = "";
    int computerInt;
    String result;
    Scanner scan = new Scanner (System.in);
    Random generator = new Random();
   
    
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
		if (personsMove.equals(computersMove)) 
		       System.out.println("It's a tie"); 
		    else if (personsMove.equals("R")) 
		       if (computersMove.equals("S")) 
		          System.out.println("Rock crushes scissors. You won");
		    else if (computersMove.equals("P")) 
		            System.out.println("Paper eats rock. You lost"); 
		    else if (personsMove.equals("P")) 
		       if (computersMove.equals("S")) 
		       System.out.println("Scissor cuts paper. You lost"); 
		    else if (computersMove.equals("R")) 
		            System.out.println("Paper eats rock. You won"); 
		    else if (personsMove.equals("S")) 
		         if (computersMove.equals("P")) 
		         System.out.println("Scissor cuts paper. You won"); 
		    else if (computersMove.equals("R")) 
		            System.out.println("Rock breaks scissors. You lost"); 
		    else 
		         System.out.println("Really thats not a Choice... "); 
		
	}

}
