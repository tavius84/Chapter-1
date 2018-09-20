package practice;

import java.util.Scanner;

public class ageGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int usersAge;
       String result = null;
       Scanner input = new Scanner(System.in);
		System.out.println("Please enter your age to be insulted");
		usersAge = input.nextInt();
		if(usersAge <= 12) {
		result = " its past your bedtime ";
		}
		else if(usersAge >= 13 && usersAge <=18) {
			result = " Why arent you working yet?";
			}
		else if(usersAge >= 19 && usersAge <=25) {
			result = "Move out already!";
			}
		else if(usersAge >= 26 && usersAge <=30) {
			result = " how is life?";
			}
		else if(usersAge >= 31 && usersAge <=40) {
			result = " Get up for work!";
			}
		else if(usersAge >= 41 && usersAge <=50) {
			result = " wanna move back in?";
			}
		else if(usersAge >= 51 && usersAge <=60) {
			result = " enjoy retirement.";
			}
		else if(usersAge >=61) {
			result = " Your tired, sleep.";
			}
		displayMessage(result);	
		//o-12
		//13-18
		//26-30
		//30-40
		//41- 50
		//51 - 60
		//60 - death	
	}
	public static void displayMessage(String result) {
	System.out.println(result);	

}

}
