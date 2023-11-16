package test;

public class OccurenceCharacter {

	public static void main(String[] args) {
		String input="HelloWorld";
		char find='l';
		int count=0;
		
		for(int i=0; i<input.length();i++) {
			if(input.charAt(i)==find)
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
