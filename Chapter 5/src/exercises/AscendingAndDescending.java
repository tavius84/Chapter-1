package exercises;

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;
		int low = 0;
		int medium = 0;
		int high = 0; 
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number >> "); 
		num1 = input.nextInt(); 
		System.out.println("Please enter another number >> "); 
		num2 = input.nextInt(); 
		System.out.println("Please enter another number >> "); 
		num3 = input.nextInt(); 
		
		
		if(num1 <= num2 && num1 <= num3) {
			low = num1; 
			if(num2 <= num3 ) {
				medium = num2;
				high = num3; 
			}
			else
			{
				medium = num3;
				high = num2; 
			}
		}
			if(num2 <= num1 && num2 <= num3) {
				low = num2; 
				if(num1 <= num3 ) {
					medium = num1;
					high = num3; 
				}
				else
				{
					medium = num3;
					high = num1; 
			}
		}
			if(num3 <= num2 && num3 <= num2) {
				low = num3; 
				if(num3 <= num2 ) {
					medium = num3;
					high = num1; 
				}
				else
				{
					medium = num1;
					high = num3; 
			}
		}
			
		System.out.println(low + " " + medium + " " + high); 
	

}
}
