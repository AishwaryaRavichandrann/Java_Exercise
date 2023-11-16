package test;

import java.util.*;

public class MinValueArray {
	int[] arr= {5,8,-1};
	
	public void ArraysSort() {
		
		Arrays.sort(arr);
		int minValue=arr[0];
		
		System.out.println("Using Array: "+minValue);
				
	}
	
	public void Collections() {
			
		List<Integer> list= new ArrayList<Integer>();
		
		for (int i=0;i<arr.length;i++) {
			
			list.add(arr[i]);
			
		}
		
		int value=Collections.min(list);
		
		System.out.println("Using Collections: "+value);
				
		
	}
	

	public static void main(String[] args) {
		
		MinValueArray minvalue=new MinValueArray();
		
		minvalue.ArraysSort();
		
		minvalue.Collections();

	}

}
