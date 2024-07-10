package array;

import java.util.Arrays;

public class Quiz4 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			
			int[] arr = {i};
				
			System.out.println(Arrays.toString(arr));
		}
		
		
		
	}

}
