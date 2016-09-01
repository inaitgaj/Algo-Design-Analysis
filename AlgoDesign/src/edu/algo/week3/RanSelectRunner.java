package edu.algo.week3;

import java.util.ArrayList;
import java.util.List;

public class RanSelectRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomisedSelection rs = new RandomisedSelection();
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(12);list.add(10);list.add(8);list.add(6);list.add(4);list.add(2);list.add(0);
		System.out.println(rs.RSelect(list, 5));
	}

}
