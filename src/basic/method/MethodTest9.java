package basic.method;

public class MethodTest9 {
	public static void main(String[] args) {
		int[] n = {100, 200};
		
		swapFunction(n);								// call by reference
		System.out.println(n[0]);
		System.out.println(n[1]);
	}

	private static void swapFunction(int[] yongbin) {   // n변수명 아무거나 사용해도 상관없음
		int temp = yongbin[0];							// 참조형으로 넘겼을때는 값을 수정하면 값이 바뀐다.(주소값을 가르키기때문)  
		yongbin[0] = yongbin[1];
		yongbin[1] = temp;
		
	}
}
