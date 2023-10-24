package inter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection {
	public static void main(String[] args) {
		
		// set
		
		Set<Object> st= new HashSet<Object>();
		st.add("Sowmiya");
		st.add("Yaj");
		st.add(1);
		st.add(true);
		
		int i= st.size();
		System.out.println(i);
		Iterator<Object> it= st.iterator();
		while(it.hasNext()) {
			Object s= it.next();
			System.out.println(s);
		}
		
		// Map
		
		Map<String,String > mp= new HashMap<String,String>();
		mp.put("name", "Sowmiya");
		mp.put("emp", "Cogn");
		mp.put("add", "Kent");
		mp.put("name", "Yaj");
		System.out.println(mp.get("name"));
		
		
	}
	

}
