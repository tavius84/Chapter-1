package chapter1_execises;

import javax.swing.JOptionPane;

public class RandomGuess {

	public static void main(String[] args) {
       
		JOptionPane.showMessageDialog(null, "The Number is "+(1 + (int)(Math.random() *  10)));
		
	}

}
