package debugging;

import java.util.Scanner;

public class FixDebugThree3 {
	 public static void main(String args[])
	   {
	      String name;
	      Object getName = null;
		name = (String) getName;
	      displayGreeting(name);           
	   }
	   private static void name(Object getName) {
		// TODO Auto-generated method stub
		
	}
	public static String getName()
	   {
	      String name;
	      Scanner input = new Scanner(System.in);
	      System.out.print("Enter name ");
	      name = input.nextLine();
	      return name;
	   }
	   public static void displayGreeting(String name)
	   {
	      System.out.println("Hello, " + name + "!");
	   }
}
