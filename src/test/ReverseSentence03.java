package test;

//import java.util.ArrayList;

public class ReverseSentence03 {

	public static void main(String[] args) {

		String input="Hi there";
		
		
		String[] output=input.split(" ");
		
		//System.out.println(output.length);
		
		for(int i=output.length-1;i>=0;i--) {
			
			System.out.print(output[i]+" ");
			

		}
		
		
	}

}
