package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Practice03 {

	public static void main(String[] args) {
		Practice03 p= new Practice03();
		//p.test01();p.test02();p.test03();p.test04();p.test05();
		p.test06();
	}

	//Smallest number in Array
	public void test01() {

		int[] arr= {5,6,7,-1};
		int minvalue= arr[0];
		for(int i=0; i< arr.length;i++) { 
			if (arr[i]<minvalue) { 
				minvalue=arr[i]; 
			} 
		}
		System.out.println("Using iteration: "+minvalue);

		ArrayList<Integer> list =new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}

		Collections.sort(list);
		System.out.println("Using collection: "+Collections.min(list));

		Arrays.sort(arr);
		System.out.println("Using Array: " +arr[0]);


	}

	//Reverse words in a sentence
	public void test02() {

		/*
		 * String input="Hi There"; String[] ch=input.split(" ");
		 * 
		 * 
		 * for(int i=ch.length-1; i>=0;i--) { System.out.println(ch[i]+" "); }
		 */

		String input="Hi there";


		String[] output=input.split(" ");

		//System.out.println(output.length);

		for(int i=output.length-1;i>=0;i--) {

			System.out.print(output[i]+" ");


		}


	}

	//Element present in the array or not
	public void test03() {

		int[] arr= {5,6,7};
		int findElement=15;
		int count=0;

		for(int n :arr) {

			if(n== findElement) {
				System.out.println("Element is present");
				count++;
			}

		}
		if(count==0) {
			System.out.println("Element is not present");
		}

		boolean found=IntStream.of(arr).anyMatch(element->element==findElement);
		if(found) System.out.println("Element is present");
		else System.out.println("Element is not present");

	}

	// find the position of an English alphabet
	@SuppressWarnings({ "resource" })
	public void test04() {

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a character");
		char input=scanner.next().charAt(0);
		
		input=Character.toLowerCase(input);
		//System.out.println(input);
		int Ascii=(int)input;
		int position=Ascii-96;
		
		System.out.println(position);
		

	}
	
	//Number of Occurrence in String
	public void test05() {
		
		String input="Hello World";
		int size1=input.length();
		char find='o';
		String find01=Character.toString(find);
		/*int count=0;
		
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==find) {
				count++;
			}
		}
		System.out.println(count);*/
		
		input=input.replace(find01,"");
		int size2=input.length();
		System.out.println(size1-size2);
			
		
	}
	
	// Replace vowels with a special characters
	public void test06() {
		
		String input="I love myself";
		char[] chararray=input.toCharArray();
		for(int i=0;i<input.length();i++) {
			if((chararray[i]=='a')||(chararray[i]=='e')||(chararray[i]=='i')||(chararray[i]=='o')||(chararray[i]=='u')) {
				chararray[i]='*';
			}
		}
		System.out.println(chararray);
	}
}


