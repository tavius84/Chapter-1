package practice;

import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String result = null;
		Scanner input = new Scanner(System.in); 
		int minutes;
        int textMessages;
        int dataUsage;
		System.out.println("How much minutes you have used, enter here >> ");
		minutes = input.nextInt();
		System.out.println("How much text messages have you sent, enter here >> ");
		textMessages = input.nextInt();
		System.out.println("How much data have used, enter here >> ");
		dataUsage = input.nextInt();
		
		
        
        if (minutes > 500 && dataUsage == 0 && textMessages == 0) {
        	result = " Plan A at $49 per month";
        }
        else if (minutes < 500 && textMessages > 0 && dataUsage == 0) {
        	result = " Plan B at $55 per month";
        }
        else if(minutes > 500 && dataUsage == 0  ) {
        	if (textMessages < 100 ) {
        		result = " Plan C at $61 per month ";
        	}
        	else
        		result = " Plan D at $70 per month";         		
        }
        else if (dataUsage > 0 && dataUsage < 2 ) { 
        	result = "You need plan E for $79 per month";
        }
        else if ( dataUsage >= 2 ) { 
        	result = "Plan F for $87 per month";
        }
        System.out.println(result);
	}

}
