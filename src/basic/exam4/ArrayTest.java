package basic.exam4;

public class ArrayTest {
	public static void main(String[] args) {
//		int[] score = new int[]{100, 90, 70}; //선언과 동시에 초기화
	
		int[] score = {100, 90, 70};          //선언과 동시에 초기화
		
		
		for(int i=0; i < score.length; i++){
			System.out.println(score[i]);
		}
	
	}

}
