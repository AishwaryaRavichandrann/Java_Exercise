package test;

public class NumberOfVowels {

	public static void main(String[] args) {
		
		String input="I Love Myself";
		input=input.toLowerCase();
		int count=0;
				
		for(int i=0;i<input.length();i++) {
			
			if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
