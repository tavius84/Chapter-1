package debugging;

public class FixDebugThree1 {
	
		   public static void main(String args[])
		   {
		      double myCheck = 50.00;
		      double yourCheck = 19.95;
		      System.out.println("Tips are");
		      calcTip(myCheck);
		      calcTip(yourCheck);
		    }
		    public static void calcTip(double yourCheck)
		    {
		      final double RATE = 0.15;
		      double tip;
		      tip = yourCheck * RATE;
		      System.out.println("The tip should be at least " + tip);
		    }
		
		}

