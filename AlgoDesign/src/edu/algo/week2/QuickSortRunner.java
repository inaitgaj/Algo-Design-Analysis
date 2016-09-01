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
		File f = new File("C:\\Users\\nikhiljagtiani\\HybrisWorkspace\\InversionsRanking\\src\\edu\\algo\\week2\\QuickSortTestCase.txt");
		Scanner file = new Scanner(f);
		while(file.hasNextInt()){
			a.add(file.nextInt());
			System.out.println(" for i="+i+", a[i] = "+a.get(i));
			i++;
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	System.out.println("Size of a being passed:"+a.size());
	/*int count=0;
	int first = a[0];
	for(int j = 1; j<10000;j++){
		if(a[j]<first){
			count++;
		}
	}
	System.out.println("count:"+count+"first:"+first);*/
	QuickSort qs = new QuickSort();
	long b = qs.quickSort(a, 0, a.size() - 1);
	
		System.out.println("Returned sorted[comparisons] is "+b);
	
}
}
