package basic.exam2;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오(0~100) : "); 
		int a = sc.nextInt();
		
		if (a >= 90) {            
			System.out.println("A"); 
		} else if (a >= 80) {               
			System.out.println("B");
		} else if (a >= 70) {
			System.out.println("C");
		} else if ( a >= 60) {
			System.out.println("D");
		} else if (a >= 0 ) {
			System.out.println("F");
		} else {
			System.out.println("0~100 값을 입력하시오");
		}
	}
}

/*		
		if ( 90 <= score && score <=100 ) System.out.println("A"); 
		else if ( 80>=score && score <=89 ) System.out.println("B");
		else if ( 70>=score && score <=79 ) System.out.println("C");
		else if ( 60>=score && score <=69 )System.out.println("D");
		else if ( 0 >=score && score <=59 ) System.out.println("F");
		else {
			System.out.println("0~100 값을 입력하시오");
			
	}*/


