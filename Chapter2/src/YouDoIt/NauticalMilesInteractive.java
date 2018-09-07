package YouDoIt;

import java.util.Scanner;

public class NauticalMilesInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double NM_IN_KLICKS= 1.852;
		double NM_IN_MILES= 1.50779;
		double nauticalMiles; 
		double miles;
		double kilometers;
		 
		
		Scanner input = new Scanner(System.in);
		System.out.println("How many nautical miles are there? ");
		nauticalMiles = input.nextInt(); 
		
		miles = nauticalMiles *  NM_IN_MILES; 
		
		kilometers = nauticalMiles * NM_IN_KLICKS;
		
		System.out.println("In " + nauticalMiles + " Nautical miles there are " + miles + " Miles and " 
				 + kilometers + " Kilometers ");
	}

}
