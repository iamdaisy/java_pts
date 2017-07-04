package basic.exam;
import java.util.Scanner;

public class ArithmaticTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
	
		
		System.out.print("a : "); a = sc.nextInt();
		System.out.print("b : "); b = sc.nextInt();
	
		
		
		System.out.println(a + "+" + b + "=" + (a + b));
    	System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "*" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + (a / b)); // 정수/정수 = 정수
		System.out.println(a + "/" + b + "=" + ((double)a / b)); //실수값으로 나타내려면 형변환 해야함
		System.out.println(a + "%" + b + "=" + (a % b));

	}
}
