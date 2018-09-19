//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);
		
		// 1. Use each value of randomNumber to give the user a random compliment.
if (randomNumber==0) {
	
 
} else if (randomNumber==2) {
	JOptionPane.showMessageDialog(null, "dave is trash");
} else if (randomNumber==3) {
	JOptionPane.showMessageDialog(null, "dave sucks");
} else if (randomNumber==4) {
	JOptionPane.showMessageDialog(null, "dave is not the coolest person in the world he is a little funny even he makes me do things");
} else if(randomNumber==5) {
	JOptionPane.showMessageDialog(null, "dave is not beutiful dave looks like a monster");
} else if(randomNumber==6) {
	JOptionPane.showMessageDialog(null, "dave smells funky smells like TRASH");
} else if(randomNumber==7) {
	JOptionPane.showMessageDialog(null, "dave is ok");
}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
