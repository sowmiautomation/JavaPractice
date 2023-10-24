package inter;

public class Reverse {
	public static void main(String[] args) {
		String s1= "Sowmiya";
		StringBuilder str= new StringBuilder("sowmiya");
		
		str.reverse();
		System.out.println(str);
		
		
		StringBuffer str1= new StringBuffer(s1);
		str1.reverse();
		System.out.println(str1);
		
		
		String s3="SoWmiYa";
		String cap="";
		for(int i=0; i<s3.length();i++) {
			char j= s3.charAt(i);
			if((j>='A')&&(j<='Z')) {
				cap= cap+j;
			}
		}
		
		System.out.println(cap);
		
		
		String s4="popyppo";
		String str4="";
		System.out.println(s4.length());
		
		
		
		for(int i= s4.length()-1; i>= 0; i--) {
			
			str4= str4+s4.charAt(i);
		}
		if(s4.equals(str4)) {
			System.out.println("It's Palindrome");
			System.out.println(str4);
		}else {
			System.out.println("Not Palindrome");
			System.out.println(str4);
		}
		
	}
}
