package basic.method;

public class MethodTest6 {
	public static void main(String[] args) {
		print(1);
		print(2,3);        // method overloading
		print(4,5,6);

	/*		
		String name = "최지웅";
	    print(name);
	    System.out.println(name);       String 타입 나중에 설명
	*/    
	    int a=10, b=5;
	    swapNumber(a, b);
	    
		
		int[] lotto = {1, 2, 3, 4, 5, 6};
	    swapRandom(lotto);
	    for(int i=0; i<lotto.length; i++) {
	    	System.out.print(lotto[i]+ "\t");
	    }

	}

	
	// 기본자료형은 값을 수정시 리턴후 원래 값 (바뀌지 않음)
	private static void swapNumber(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		
	}
	// 참조자료형은  값을 수정시 리턴후에도 값이 바뀜 (string을 제외)
	private static void swapRandom(int[] lotto) { 
		int temp = lotto[0];
		lotto[0] = lotto[5];
		lotto[5] = temp;
		
		
	}

	private static void print(String name) {
		name = "박병규";
		
	}

	private static void print(int... i) {         //가변형 매개변수 (java5부터 사용가능)
		for(int j=0; j < i.length; j++){         // for(int j:i)  (i에 값이 없을때까지)  - java5
			System.out.print(i[j]+"\t");         // System.out.print(j + "\t");
		}
		System.out.println();
		
	}

	
	
/*	private static void print(int i, int j, int k) {
		System.out.println(i + "\t" + j + "\t" + k);
	}

	private static void print(int i, int j) {
		System.out.println(i + "\t" + j);
	}
	
	private static void print(int i) {	
		System.out.println(i);
	}*/

}
