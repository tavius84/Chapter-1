package YouDoIt;

import java.util.Scanner;

public class IntegerDemoInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double anInt;
        byte aByte; 
        short aShort; 
        long aLong; 
        String name; 
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter an integer");
        anInt = input.nextInt();
        System.out.println("Please enter an Byte");
        aByte = input.nextByte();
        System.out.println("Please enter an Short");
        aShort = input.nextShort();
        System.out.println("Please enter an Long");
        aLong = input.nextLong();
     
        System.out.println("What is your name >> "); 
        name = input.nextLine(); 
        
        
        System.out.println("your name is " + name); 
        System.out.println("The int is " + anInt);
        System.out.println("The byte is " + aByte);
        System.out.println("The short is " + aShort);
        System.out.println("The long is " + aLong);
        
	}

}
