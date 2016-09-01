package edu.algo.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * OrderStatistic is from 0 to length -1
 * i.e, if array = [12,10,8,6,4,2,0] is passed 
 * order statistic = 1, Smallest number = 2
 * orderStatistic = 3, number = 6
 * orderStatistic = 5, number = 10 and so on.
 * 
 * @author nikhiljagtiani
 *
 */
public class RandomisedSelection {

	/**
	 * 
	 * @param arr the List of Integer.
	 * @param orderStat Order Statistic 0 to length (place in sorted array)
	 * @return Integer = which is order statistic in the List passed
	 */
	public Integer RSelect(List<Integer> arr, int orderStat) {
		int len = arr.size();
		if (len == 1) {
			return arr.get(0);
		}

		Random r = new Random();
		Integer pivot = arr.get(r.nextInt(arr.size()));
		partition(arr, pivot);
		int pIndex = arr.indexOf(pivot);
		if(pIndex==orderStat){
			return pivot;
		}
		else if(pIndex>orderStat){
			return RSelect(arr.subList(0,pIndex),orderStat);
		}
		else if(pIndex<orderStat){
			return RSelect(arr.subList(pIndex + 1,len),orderStat-pIndex-1);
		}
		
		return null;
	}

	public List<Integer> partition(List<Integer> array, Integer pivot) {
		int r = array.size()-1;
		int l = 0;
		int n = r - l + 1;
		int i = l + 1;
		if (n <= 1)
			return array;
		Collections.swap(array,l,array.indexOf(pivot));
		for (int j = l + 1; j <= r; j++) {
			if (array.get(j) < pivot) {
				Collections.swap(array, j, i);
				i++;
			} else if (array.get(j) > pivot) {
			}
		}
		Collections.swap(array, l, i - 1);
		return array;

	}

}
