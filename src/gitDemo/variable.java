package gitDemo;

public class variable {
	static int a=11;  
	//String B;
	int d ;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=5;   // local method we can not access in other method
		String s="samiksha";
		char c = 'A';
		
		
		System.out.println(i);
		System.out.println(s);
		System.out.println(c);
		demo();
		
		

	}
	
	public static void demo() {
		
		variable var = new variable();
		var.d=15;
		System.out.println(a);
		System.out.println(var.d);
		
		
	}

}
