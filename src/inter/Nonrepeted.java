package inter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Nonrepeted {

	public static void main(String[] args) {
		String s1="appleepeeeeeeeeeeeppppppppppaaaaaaaaaaaaaaal";
		char[] s2= s1.toCharArray();
		Set<String> s = new HashSet<String>();
		String cs = "";
		//System.out.println(s1.length());
		for(int i= 0; i<s2.length; i++)
			for(int j=i+1; j<s2.length; j++) {
				if(s2[i]==s2[j]) {
					cs = Character. toString(s2[j]);
					s.add(cs);
					break;
				}
			}
		Iterator itr    =   s.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}

	}
}
