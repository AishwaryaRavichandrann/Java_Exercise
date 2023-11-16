package test;


public class Practice02 {

	public static void main(String[] args) {
		Practice02 p= new Practice02();
		//p.test01();
		//p.test02();
		p.test03();
		p.test04();

	}
	
	//Reverse a number
	public void test01() {
		
		int num=234;
		int reminder; String rev="";
		while(num!=0) {
			reminder=num%10;
			rev=rev+reminder;
			num=num/10;
		}
		System.out.println(rev);
	}
	
	//right triangle pattern
	public void test02() {
		
		int row=5;
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
	
	//Number increasing pyramid
	public void test03() {
		int row=5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	// Number Changing Pyramid
    public void test04() {
    	int row=4, startingNum=1;
    	for(int i=1;i<=row;i++) {
    		for(int j=1;j<=i;j++) {
    			System.out.print(startingNum);
    			startingNum=startingNum+1;
    			
    		}
    		System.out.println();
    	}
    	
    }
    
    
}
