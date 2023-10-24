package inter;

import java.util.ArrayList;
import java.util.List;

public class JavaProgram {

	public static void main(String[] args) {
//		String s1="SowmiyaManojkumarYaj";
//		System.out.println(s1.length());
//		int i=0;
//		char[] ch= s1.toCharArray();
//	    for(char e: ch ) {
//	    	i= i+1;	
//	    }
//	    
//	    System.out.println(i);
	    
	    int a[]= {10,20,2456,1008,45,36567,7889,25685,8996};
	   int max= 10;
	   for(int i=0;i<a.length;i++) {
		   if(max<a[i]) {
			   max= a[i];
		   }
	   }
	   System.out.println(max);
	  
	}
	
	
	


}
