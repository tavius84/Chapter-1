package tutorial;

public class DemoRaise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double salary = 200.00; 
		double startingWage = 800.00;
		System.out.println("Demostrating some raises ");
		predictRaise(400.00);
		predictRaise(salary); 
		predictRaise(startingWage);
	}
	public static void predictRaise(double salary) {
		
		double newSalary;
		final double RAISE_RATE = 1.10;
		newSalary = salary * RAISE_RATE; 
		System.out.println("Current salary" + salary + "    after raise:    " + newSalary);  		
		
		
	} 
	

}
