package test;

public class palindrome {

	public static void main(String[] args) {
		int input=212;
		StringBuilder sb= new StringBuilder();
		sb.append(input);
		sb.reverse();
		
		int val = Integer.parseInt(sb.toString());
		
		if(input==val) {
			System.out.println("The given number is a Palindrome");
		}
		else
			System.out.println("Not a Palindrome number");

	}

}
