package gameZone;

import java.util.Scanner;

public class CondoSales {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userHouse;
		
		String result = null;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please choose a condo");
		userHouse = input.nextInt();
		
		
		 if(userHouse == 1) {
			 result =  " A view of the big beautiful park $150,000";
		 }
		 else if (userHouse == 2) {
			 result = " A view of the beautiful lake $270,000 ";
		 }
		 else if (userHouse == 3) {
			 result = "The view of the nearby golf course $170,000";
		 }
		 else {
			 result = "Not a choice";
		 }
		 displayMessage(result); 
	}
	private static void displayMessage(String result) {
		// TODO Auto-generated method stub
		System.out.println(result); 
	}

}
