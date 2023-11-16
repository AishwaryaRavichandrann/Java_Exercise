package test;

public class RemoveWhiteSpace05 {

	public static void main(String[] args) {
		String input=" Hello World";
		System.out.println(input.trim());
		
		System.out.println(input.stripLeading());
		System.out.println(input.stripTrailing());
	}

}
