package test;

import java.util.Scanner;

public class ReverseString01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		System.out.println("Give a String: ");
		String input=keyboard.nextLine();
		
		StringBuilder sb= new StringBuilder();
		sb.append(input);
		sb.reverse();
		
		System.out.println("Reversed String: "+sb);
	}

}
