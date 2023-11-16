package test;

import java.util.Arrays;
import java.util.HashSet;
//import java.util.List;

public class Practice04 {

	public static void main(String[] args) {
		Practice04 p= new Practice04();
		p.test05();

	}
	
	// Remove leading and trailing white spaces
	public void test01() {
		
		String input=" Hi Aishu ";
		System.out.println("Length before trimming: "+input.length());
		input=input.trim();
		System.out.println("Length after trimming: "+input.length());
		
		System.out.println(input.replaceAll("^[\t]+|[\t]+$",""));
		System.out.println(input.replaceAll("^[\t]+|",""));
		System.out.println(input.replaceAll("[\t]+$",""));
		
	}
	
	// Extract number from a String and add them
	public void test02() {
		
		String input="Aishwarya1998";
		char[] ch=input.toCharArray(); int count=0;
		
		for(char c : ch) {
			if(Character.isDigit(c)) {
				//System.out.println(c);
				int num=Character.getNumericValue(c); 
				//count=count+c;
				count=count+num;
			}
		}
		System.out.println(count);
	}
	
	// Missing alphabets in a String
	public void test03() {
		
		String input="abcdeiouf";
		String replacedText=input.replaceAll("[aeiou]","");
		System.out.println(replacedText);
		
		String[] ArrInput=input.split("");
		String[] ArrInput01="abcdefghijklmnopqrstuvwxyz".split("");
		
		HashSet<String> set= new HashSet<String>(Arrays.asList(ArrInput01));
				
		HashSet<String> set1= new HashSet<String>(Arrays.asList(ArrInput));
		
		set.removeAll(set1);
		
		System.out.println(set);
		
		
	}
	
	//Upper & Lower Case conversion without using built in methods
	public void test04() {
		String input="hi aishu";
		//Upper Case Conversion
		char[] chararray=input.toCharArray();
		for(int i=0;i<input.length();i++) {
			if(chararray[i]!=' ') {
			int ascii=(int)chararray[i];
			chararray[i]=(char)(ascii-32);
			}
		}
		
		System.out.println(chararray);
	}
	
	//palindrome number
	public void test05() {
		int num=21256;
		StringBuilder sb = new StringBuilder();
		sb.append(num);sb.reverse(); 
		int reversedNum=Integer.parseInt(sb.toString());
		if(reversedNum==num) System.out.println("palindrome number");
		else System.out.println("Not a palindrome number");	
	}
}
