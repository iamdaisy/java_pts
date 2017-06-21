package basic.exam;
import java.util.Scanner;

public class Arithmatic2Test {
	public static void main(String[] args) {
		// 관계연산
		
		Scanner sc = new Scanner(System.in);
				
		
		System.out.print("i : "); 
		int i = sc.nextInt(); 
		System.out.print("j : "); 
		int j = sc.nextInt();
		
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i >= j);
		System.out.println(i <= j);
		System.out.println(i == j);
		System.out.println(i != j);
	}

}
