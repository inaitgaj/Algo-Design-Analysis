package edu.algo.week2;

import java.util.Collections;
import java.util.List;

public class QuickSort {

	public static long comparisons = 0;;
	
	public long quickSort(List<Integer> array,int l, int r){
		int n = r-l+1;
		
		int i = l+1;
		if(n<=1)
			return comparisons;
		int newPivot = median(array,l,r);
		Collections.swap(array,l,newPivot);
		// q 2.Collections.swap(array,l,r);
		int pivot = array.get(l);
		
		
		for(int j=l+1;j<=r;j++){
			if(array.get(j)<pivot){
				Collections.swap(array,j,i);
				i++;
				
			}
			else if(array.get(j)>pivot){
				
			}
			
		}
		Collections.swap(array,l,i-1);
		comparisons = comparisons + n-1;
		quickSort(array,l,i-2);
		quickSort(array,i,r);
		
		return comparisons;
		
	}
	public int[] subArray(int arr[], int from, int to) {

		int retArr[] = new int[to - from + 1];
		for (int i = from, j = 0; i <= to; i++) {

			retArr[j++] = arr[i];
			// System.out.println("Ret arr j"+retArr[j]);
		}
		return retArr;

	}
	
	public void swap(int[] arr, int posA, int posB){
		int temp = arr[posA];
		arr[posA] = arr[posB];
		arr[posB] = temp;
	}
	static int median(List<Integer> toSort, int start, int end) {
		int middle = (end + start) / 2;
		int n1 = toSort.get(start);
		int n2 = toSort.get(middle);
		int n3 = toSort.get(end);
		if ((n1 - n2)*(n3 - n1) > 0) {
			return start;
		} else if ((n2 - n1)*(n3 - n2) > 0) {
			return middle;
		} else {
			return end;
		}
	}
	
}
