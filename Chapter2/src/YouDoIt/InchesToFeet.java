package YouDoIt;

public class InchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int feetRemaining;
		int inchesRemaining;
		int feet = 12; 
		int inchesEntered = 86;
		
		feetRemaining = inchesEntered/feet;
		feetRemaining = 7;
		inchesRemaining = inchesEntered % feet;
		
		System.out.println("you have this many feet " + feetRemaining + " and " + inchesRemaining + " inches " ); 
		
		
	}

}
