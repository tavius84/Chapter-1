package exercises;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int skillLevel ; 
        int hoursWorked; 
        int insuranceOption;
        int payRate = 0;
        String result;
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your skill level >>");
        skillLevel = input.nextInt();
        System.out.println("Please enter how many hours you have worked >> ");
        hoursWorked = input.nextInt();
        
        
        
        
        if(skillLevel == 1) {
        	insuranceOption = 0;
        	payRate = 17;
        	displayTotalPay(hoursWorked, insuranceOption, payRate);
        }
       
        
	}

	private static void displayTotalPay(double hoursWorked, int insuranceOption, double payRate) {
		// TODO Auto-generated method stub
		int medicalInsurance;
		int denetalInsurance; 
		int longTermdisabilityInsurance;
	}

}
