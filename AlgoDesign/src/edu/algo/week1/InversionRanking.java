package edu.algo.week1;

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
			right = subArray(array, mid, size - 1);
			left = mergeSort(left);
			right = mergeSort(right);
			result = merge(left, right);
		}
		return result;

	}

	private int[] merge(int[] left, int[] right) {
		int lenLeft = left.length;
		int lenRight = right.length;
		int[] result = new int[lenLeft + lenRight];
		int lenResult = result.length;
		int i = 0, j = 0, k = 0;
		while (i < lenLeft && j < lenRight) {

			if (left[i] <= right[j]) {
				result[k++] = left[i++];

			} else if (left[i] > right[j]) {
				inversions += lenLeft - i;
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

	public int[] subArray(int arr[], int from, int to) {

		int retArr[] = new int[to - from + 1];
		for (int i = from, j = 0; i <= to; i++) {

			retArr[j++] = arr[i];
		}
		return retArr;

	}
}
