package com.greatlearning.notecount.main;

import java.util.Scanner;
import com.greatlearning.notecount.services.counting.NoteCounting;
import com.greatlearning.notecount.services.sorting.MergeSortImplementation;
/**
 * 
 * @author sohandesai
 *
 */
public class NotecountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortImplementation sort = new MergeSortImplementation();
		NoteCounting count = new NoteCounting();
		Scanner scan = new Scanner(System.in);
		
		//Getting total number of currency denominations
		System.out.println("Enter the size of currency denominations:");
		int denom = scan.nextInt();
		int[] notes = new int[denom];
		
		//Storing the individual currency denominations amount into array "notes"
		System.out.println("Enter the currency denominations value");
		for(int j=0; j<denom; j++)
			notes[j]=scan.nextInt();
		
		//Getting the amount to be paid
		System.out.println("Enter the amount you want to pay");
		int amount = scan.nextInt();
		
		//Sorting the currencies in 'notes, array in descending order
		sort.mergeSort(notes, 0, notes.length-1);
		
		/*Determining and printing the appropriate combination of given currencies
		 * such that the entire amount is paid with minimum number of notes
		 */
		count.notesCountImplementation(notes, amount);
		scan.close();
	}

}
