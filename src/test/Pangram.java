package test;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class Pangram {

	public static void main(String[] args) {


		String input="a";
		input=input.toLowerCase();
		input=input.replaceAll(" ","");
		String[] input1=input.split("");


		/*
		 * ArrayList<String> list= new ArrayList<String>(); list.add(input);
		 * System.out.println(list);
		 * 
		 * char[] MissingAlphabet="abcdefghijklmnopqrstuvwxyz".toCharArray();
		 * 
		 * ArrayList<Character> list1= new ArrayList<Character>(); for(char ch :
		 * MissingAlphabet) { list1.add(ch); }
		 * 
		 * System.out.println(list1);
		 * 
		 * list1.removeAll(list); System.out.println(list1);
		 */


		HashSet<String> set1= new HashSet<String>(Arrays.asList(input1));
		System.out.println(set1);



		String[] MissingAlphabet1="abcdefghijklmnopqrstuvwxyz".split("");
		HashSet<String> set2= new HashSet<String>(Arrays.asList(MissingAlphabet1));
		System.out.println(set2);

		set2.removeAll(set1);
		System.out.println(set2);
		String rev="";
		for(String ch:set2) {
			 rev = rev+ch;
		}
		System.out.println(rev);

	}

}
