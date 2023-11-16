package test;

public class ExtractNumString {

	public static void main(String[] args) {

		String input = "Aishwarya1998";
		input = input.toLowerCase();
		char[]ch= input.toCharArray();
		int sum=0;

		for (char c : ch) {
			
			if(Character.isDigit(c)) {
				
				int numericValue=Character.getNumericValue(c);
				sum=sum+numericValue;
				
			}
			
			
		}
		System.out.println(sum);
	}

}
