package test;

//import java.util.Arrays;

public class ArrayContainsElement {

	public static void main(String[] args) {
		
		int[] array= {5,10,20};
		int findElement= 19;
		int count=0;
		
		// ForEach loop\
		for(int num : array) {
			if(num==findElement) 		
				System.out.println("Element is present in the array");
				count++;
			
		}
		if(count!=0)
			System.out.println("Element is not present in the array");

}}
