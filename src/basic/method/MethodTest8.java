package basic.method;

public class MethodTest8 {
	public static void main(String[] args) {
		int a = 10;
		testFunction(a);                      //call by value
		System.out.println(a);
	}

	private static void testFunction(int a) {    //testfunction 의 a값은 이 문장이 끝나면 어차피 소멸됨 
		a++;
		
		
	}

}
