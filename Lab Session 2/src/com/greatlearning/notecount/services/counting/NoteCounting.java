package com.greatlearning.notecount.services.counting;
/**
 * 
 * @author sohandesai
 *
 */
public class NoteCounting {
	
	public void notesCountImplementation(int[] notes, int amount) {
		int[] noteCounter = new int [notes.length];
		
		try {
			/*
			 * if the amount is greater than currency, determine the number of notes required
			 * until amount is less than currency denomination
			 * Move onto the next (smaller) denomination and repeat until amount=0
			 */
			for(int i=0; i<notes.length; i++) {
				if(amount>=notes[i]) {
					noteCounter[i]=amount/notes[i];
					amount=amount-(notes[i]*noteCounter[i]);
				}
			}
			if(amount>0)
				System.out.println("Sorry!\nExact amount cannot be given with the highest denomination");
			else {
				System.out.println("Your payment approach in order to give min no of notes will be:");
				for(int j=0; j<noteCounter.length; j++) {
					if(noteCounter[j]!=0) {
						System.out.println(notes[j] +":" +noteCounter[j]);
					}
				}
			}
		}//Exception handled if notes[i]=0
		catch(ArithmeticException e) {
			System.out.println(e+ "Notes of denomination '0' are invalid!");
		}
	}
}
