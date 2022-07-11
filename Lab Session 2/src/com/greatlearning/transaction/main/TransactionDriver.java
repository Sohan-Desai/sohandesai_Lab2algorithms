package com.greatlearning.transaction.main;
import java.util.Scanner;
import com.greatlearning.transaction.services.TransactionService;
/**
 * 
 * @author sohan
 *
 */
public class TransactionDriver {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		TransactionService transServ = new TransactionService();
		
		//Getting the total number of transactions made
		System.out.println("Enter the size of transaction array:");
		int size = scan.nextInt();
		int[] arr = new int[size];
		
		//Storing the individual transaction amounts into array "arr"
		System.out.println("Enter the values of array");
		for (int i=0; i<size; i++) {
			arr[i]=scan.nextInt();
		}
		
		//Getting total number of targets to be achieved
		System.out.println("Enter the total no of targets that need to be achieved");
		int targetSize = scan.nextInt();
		int target;
		
		/*
		 * loop runs for each target to verify whether the total transaction
		 * amounts add up to achieve the intended target
		 */
		while (targetSize-->0) {
			System.out.println("Enter the value of target");
			target=scan.nextInt();
			transServ.checkTransaction(arr, target);			//check for target
		}
		scan.close();
	}

}
