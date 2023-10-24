package inter;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = null;
		if (arr == null) {
			System.out.println("array is null");
		}

		arr = new int[0];
		if (arr.length == 0) {
			System.out.println("array is empty");
		}

		Object ar[] = new Object[10];
		boolean empty = true;
		for (int i=0; i<ar.length; i++) {
			if (ar[i] != null) {
				empty = false;
				break;
			}
		} 
		Object ar2[] = new Object[10];
		boolean empty1 = true;
		for (Object ob : ar2) {
			if (ob != null) {
				empty = false;
				break;
			}
		}



	}

}
