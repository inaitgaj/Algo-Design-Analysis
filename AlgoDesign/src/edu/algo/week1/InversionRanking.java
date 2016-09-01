package edu.algo.helper;

public class InversionRanking {
	long inversions = 0;

	public int[] mergeSort(int array[]) {
		int[] left, right, result = null;
		int size = array.length;
		if (size <= 1)
			result = array;
		else if (size > 1) {
			int mid = size / 2;
			left = subArray(array, 0, mid - 1);
			// System.out.println("Left Subarray len = "+left.length);
			right = subArray(array, mid, size - 1);
			// System.out.println("Right Subarray len = "+right.length);
			left = mergeSort(left);
			right = mergeSort(right);
			result = merge(left, right);
			// System.out.println("Result of merged Subarray len =
			// "+result.length);
		}
		// System.out.println("MergeSort proc returning:"+result);
		return result;

	}

	private int[] merge(int[] left, int[] right) {
		// TODO Auto-generated method stub
		// System.out.println("need to merge :" +left[0]+"," +right[0]);
		int lenLeft = left.length;
		int lenRight = right.length;
		int[] result = new int[lenLeft + lenRight];
		int lenResult = result.length;
		// if(left[lenLeft-1]<right[0]){
		// result=append(left,right);
		// }
		int i = 0, j = 0, k = 0;
		while (i < lenLeft && j < lenRight) {

			if (left[i] <= right[j]) {
				// System.out.println("Left is le right, l="+left[i]+",
				// r="+right[j]);
				result[k++] = left[i++];

			} else if (left[i] > right[j]) {
				inversions += lenLeft - i;
				// System.out.println("++Inversions= remaining from 1st
				// array at i=" + i);
				result[k++] = right[j++];

			}
		}
			while(j < lenRight) {
				result[k++] = right[j++];
			}
			while(i < lenLeft) {
				result[k++] = left[i++];
			} 
		

		System.out.println("Invertions = " + inversions);
		return result;
	}

	private int[] append(int[] left, int[] right) {
		// TODO Auto-generated method stub
		return null;
	}

	public int[] subArray(int arr[], int from, int to) {

		int retArr[] = new int[to - from + 1];
		for (int i = from, j = 0; i <= to; i++) {

			retArr[j++] = arr[i];
			// System.out.println("Ret arr j"+retArr[j]);
		}
		return retArr;

	}
}
