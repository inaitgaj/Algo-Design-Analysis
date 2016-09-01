package edu.algo.week1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InversionRunner {

	public static void main(String[] args) {
		
		int[] a=new int[100_000];
		int i=0;
		try {
			File f = new File("inversions.txt");
			Scanner file = new Scanner(f);
			while(file.hasNextInt()){
				a[i]=file.nextInt();
				i++;
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Size of a being passed:"+a.length);
		InversionRanking ir=new InversionRanking();
		int[] b = ir.mergeSort(a);
	}

}
