package exercises;

public class Percentages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double x = 5;
       double y= 12;
		
       computePercent(x, y);
		
		
		
		
		
	}

	private static void computePercent(double x, double y) {
		// TODO Auto-generated method stub
		double compute;
		
		
		compute =(x / y) * 100;
		System.out.println(x + " divided by " + y +  " = " + compute + " % ");
		
		
	}

}
