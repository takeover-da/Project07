package array;

public class Quiz6 {

	public static void main(String[] args) {

		int[] arr = new int[] {5,20,100,30,77};
		
		for (int i = 1; i < 5; i++) {
			
			if (arr[i] == 20) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
