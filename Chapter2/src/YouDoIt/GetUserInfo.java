package YouDoIt;

import java.util.Scanner;

public class GetUserInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name; 
        int age;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter your name >> ");
        name = inputDevice.nextLine(); 
        System.out.println("Please enter your age >> ");
        age = inputDevice.nextInt();
        System.out.println("Your name is " + name +  " and you are " + age + " years old ");
	}

}
