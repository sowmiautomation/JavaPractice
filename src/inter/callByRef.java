package inter;

public class callByRef {

	String s1="name";
	
	public static void main(String[] args) {
		
		// call by reference
		callByRef p= new callByRef();
	    
	    System.out.println(p.s1);
		p.calc(p);
		System.out.println(p.s1);
	     
		
	}

	public  void calc(callByRef j) {
		j.s1= "Yaaj";
		
	}
	
	
}
