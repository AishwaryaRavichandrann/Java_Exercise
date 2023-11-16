package test;

import java.util.*;

public class Practice01 {

	public static void main(String[] args) {
		Practice01 p= new Practice01();
		//p.test01();
		//p.test02(); 
		//p.test03();
		p.test04();

	} 
	
	// Biggest number
	public void test01() {
		
		int a=100, b=50;
		System.out.println("Biggest number among two values is " +(a>b?a:b));
				
		
	}
	
	// String Upper and Lower case count
	@SuppressWarnings("resource")
	public void test02() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give a string: "); 
		String input=scanner.nextLine();
		int uppercount=0, lowercount=0;
		
		char[] charArray=input.toCharArray();
		for(char ch : charArray) {
			
			if(Character.isUpperCase(ch)) uppercount++;
			if(Character.isLowerCase(ch)) lowercount++; 
		}
		
		System.out.println("Upper Case count: "+uppercount + " Lower Case count: "+lowercount);
	}
	
	//String Reverse
	public void test03() {
		
		String input="Welcome Aishwarya";
		
		// String is immutable whereas StringBuilder is mutable
		
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		System.out.println("Using StringBuilder: "+sb.reverse());
		
		String reversed="";
		char[] chararray=input.toCharArray();
		for(int i=chararray.length-1;i>=0;i--) {
			reversed=reversed +chararray[i];
		}
		
		System.out.println("Using toCharArray method: " +reversed);
		
		String reverse="";
		for(int i=input.length()-1;i>=0;i--) {
			reverse=reverse+input.charAt(i);
			
		}
		
		System.out.println("Using CharAt method: "+reverse);
	}
	
	//Swap the number
	public void test04() {
		
		// Third variable
		int a=50, b=30; 
		int temp;
		temp=b; 
		b=a;
		a=temp;
		
		System.out.println("Value a: "+a+" Value b: "+b);
		
		// without using Third variable
		a=a-b; 
		b=a+b; 
		a=b-a;
		
		System.out.println("Value a: "+a+" Value b: "+b);
		
	}
	
}
