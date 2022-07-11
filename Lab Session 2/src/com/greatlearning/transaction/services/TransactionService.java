package com.greatlearning.transaction.services;
/**
 * 
 * @author sohandesai
 *
 */
public class TransactionService {
	/*calls another function findTarget with return type int
	 * if returned -1 -> print Target not achieved
	 * else it returns a positive value indicating the number of
	 * transactions taken to achieve said target
	 */
	public void checkTransaction(int[] array, int target) {
		int transactions = findTarget(array, target);
		if(transactions<0) {
			System.out.println("\nGiven target is not achieved"); 		//target not achieved
		}
		else {
			System.out.println("\nTarget achieved after " +transactions +" transactions!");
		}
	}

	/*
	 * adds up the transaction amounts until it reaches the target
	 * if target is achieved->returns the number of transactions required to achieve said target
	 * if target not achieved->returns -1
	 */
	public int findTarget (int[] array, int target) {
		int sum=0, i=0;
		while(i<array.length) {
			sum+=array[i++];
			if(sum>=target) {
				return i;			//return the number of transactions taken to achieve target
			}
		}
		return -1;					//return -1 if target not achieved
	}
}
