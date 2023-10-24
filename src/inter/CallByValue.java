package inter;

public class CallByValue {
	
	
	
	public static void main(String[] args) {
		
	
	
	int num=100;
	calc(num);
	System.out.println(num);
		
	}

	public static void calc(int num) {
	  num= num*1;
	   
	}
	
	
}
