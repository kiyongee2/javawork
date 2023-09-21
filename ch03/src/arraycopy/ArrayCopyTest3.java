package arraycopy;

public class ArrayCopyTest3 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3};
		int[] arr2 = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		arr2[1] = 5;
		arr2[4] = 10;
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}

}
