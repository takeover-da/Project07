package array;

public class Ex3 {

	public static void main(String[] args) {

		// 10개 크기의 정수형 배열 생성
		int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
//		// 1번 배열의 요소를 하나씩 꺼내서 출력하기!
//		System.out.println(intArr[0]);  //배열이름[인덱스]
//		System.out.println(intArr[1]);
//		System.out.println(intArr[2]);
//		System.out.println(intArr[3]);
//		System.out.println(intArr[4]);
//		System.out.println(intArr[5]);
//		System.out.println(intArr[6]);
//		System.out.println(intArr[7]);
//		System.out.println(intArr[8]);
//		System.out.println(intArr[9]);
		
		// 2번 for문으로~
		for (int i = 0; i <= 9; i++) {
			System.out.println(intArr[i]);
		}
		
		// 3번 배열의 크기를 알수있게 '<'로 작성하는게 좋다! 
		for (int i = 0; i < 10; i++) {
			System.out.println(intArr[i]);
		}
		
		// length: 배열의 크기
		System.out.println(intArr.length);
		
		// 4번 
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
