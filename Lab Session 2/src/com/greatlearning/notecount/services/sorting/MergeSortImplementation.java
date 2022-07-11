package com.greatlearning.notecount.services.sorting;

public class MergeSortImplementation {

	/*
	 * main sort function that divides the scope into left and right parts recursively until
	 * scope is limited to single element
	 * the elements in left and right scopes are then merged in specified order
	 */
	public static void mergeSort(int[] array, int start, int end) {
		if(start<end) {
			int mid = start+(end-start)/2;
			
			//divide scope into left and right halves
			mergeSort(array,start,mid);
			mergeSort(array,mid+1,end);
			
			//merge the elements of two halves in specified order
			merge(array, start, mid, end);
		}
	}

	/*
	 * "merges" the elements of two scopes in descending order
	 */
	public static void merge(int[] array, int start, int mid, int end) {
		int size1=mid-start+1;
		int size2=end-mid;
		
		//auxiliary array to store elements from left scope
		int[] arr1 = new int[size1];
		for(int i=0; i<size1; i++)
			arr1[i]=array[start+i];
		
		//auxiliary array to store elements from right scope
		int[] arr2 = new int[size2];
		for(int i=0; i<size2; i++)
			arr2[i]=array[mid+1+i];

		/*
		 * indices for arr1 & arr2
		 * index for actual array must begin from "start" position
		 */
		int array1Index=0;
		int array2Index=0;
		int resultIndex=start;

		/*
		 * copy the smaller element from either arrays into the main array 
		 * until either array gets exhausted.
		 * Once element from one array gets copied move to the next element
		 */
		while(array1Index<size1&&array2Index<size2) {
			if(arr1[array1Index]>=arr2[array2Index])
				array[resultIndex++]=arr1[array1Index++];
			else
				array[resultIndex++]=arr2[array2Index++];
		}
		//copy any remaining elements from arr1 directly since they are already sorted
		while(array1Index<size1)
			array[resultIndex++]=arr1[array1Index++];
		//copy any remaining elements from arr2 directly since they are already sorted
		while(array2Index<size2)
			array[resultIndex++]=arr2[array2Index++];
	}

}
