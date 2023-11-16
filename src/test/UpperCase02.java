package test;

public class UpperCase02 {

	public static void main(String[] args) {
		String input="aishwarya";
		char[] charArray=input.toCharArray();
		
		for(int i=0;i<input.length();i++) {
			if(charArray[i]>='a'||charArray[i]<='z') {
				charArray[i]=(char)(charArray[i]-32);
				
			}
		}
		System.out.println(charArray);
		
	}

}
