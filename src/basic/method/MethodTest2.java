package basic.method;

public class MethodTest2 {
	public static void main(String[] args) {
		print("yongbin");     //실매개변수
		print("heenam");
		print("hyojin");
		
		
		
	}

	private static void print(String name) {      //형식 매개변수 (타입과 갯수를 일치시켜야한다)
		
		System.out.println("*****************");
		System.out.println("* hello " + name + " *");
		System.out.println("*****************");
	
		
	}

}
