package edu.algo.week2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuickSortRunner {
	
public static void main(String[] args) {
	List<Integer> a=new ArrayList<Integer>();
	//int[] a=new int[8];
	int i=0;
	try {
		File f = new File("QuickSortTestCase.txt");
		Scanner file = new Scanner(f);
		while(file.hasNextInt()){
			a.add(file.nextInt());
			i++;
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}

	QuickSort qs = new QuickSort();
	long b = qs.quickSort(a, 0, a.size() - 1);
	
	System.out.println("Returned median pivot sorted[comparisons] is "+b);
	
}
}
