package inter;

public class OverrideEquals {

	public static void main(String[] args) {
		int arr[]= null;
		if(arr==null) {
			System.out.println("Null");
		}
		arr=new int[0]; 
		if(arr.length==0) {
			System.out.println("Empty");
		}
		Object ar[]= new Object[10];
		boolean empty= true;
		ar[0]= 10;
		for(Object ob : ar) {
			System.out.println(ob);
			for(int i=0; i<=ar.length;i++) {
			
				if(ob !=null) {
					empty= false;
					System.out.println(false);
				}
			}
		}

	}

}
