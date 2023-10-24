package inter;

import java.util.ArrayList;
import java.util.List;

public class StringClass {
	public static void main(String[] args) {
		String s1= "manoj";
		String s2="Sowmiya";
		System.out.println(s1);
		System.out.println(s2);
		int i= s1.length();
		s1= s1+s2;
		
		s2= s1.substring(0, i);
		s1= s1.substring(i);
		System.out.println(s1);
		System.out.println(s2);
		String rev="";
		
		for(int j=s1.length()-1;j>=0;j--) {
			char s= s1.charAt(j);
			rev=rev+s;
			
		}
		System.out.println(rev);
		
		int a[]= {2,3,5,7,9,10,23,245,36,78,34,46};
	    List even= new ArrayList();
		List odd= new ArrayList();;
		
		for(int r=0; r<a.length;r++) {
			
			if(a[r]%2==0) {
				System.out.print( a[r]);
				
			
			}else {
				System.out.print("odd :" +a[r]);
				
			}
			
			
		}
		
		}
			
			
	
}
