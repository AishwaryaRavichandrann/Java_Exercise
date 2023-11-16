package test;

public class ReplaceVowels04 {

	public static void main(String[] args) {
		
		String input="I Love Myself";
		input=input.toLowerCase();
		char special_char='*';
		
		for(int i=0;i<input.length();i++) {
			
			if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u')
			{
				input=input.replace(input.charAt(i), special_char);
			}
		}
		System.out.println(input);

	}

}
