package array;

public class Quiz5 {

	public static void main(String[] args) {

		int[] arr = new int[] {5,20,100,30,77};
		
		int max = arr[0];
		
		for (int i = 1; i < 5; i++) {
			
			System.out.println(arr[i] + " vs " + max);
			
			if (arr[i] > max) {
				max = arr[i];
			}
			System.out.println("?? " + max);
			System.out.println();
		}
		System.out.println(max);
	}

}
