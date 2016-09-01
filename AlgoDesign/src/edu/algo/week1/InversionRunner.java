package edu.algo.helper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InversionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=new int[100_000];
		//int[] a=new int[8];
		int i=0;
		try {
			File f = new File("C:\\Users\\nikhiljagtiani\\HybrisWorkspace\\InversionsRanking\\src\\edu\\algo\\helper\\array.txt");
			Scanner file = new Scanner(f);
			while(file.hasNextInt()){
				a[i]=file.nextInt();
				//System.out.println(" for i="+i+", a[i] = "+a[i]);
				i++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		System.out.println("Size of a being passed:"+a.length);
		InversionRanking ir=new InversionRanking();
		int[] b = ir.mergeSort(a);
		//System.out.println();
	}

}
