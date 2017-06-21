package basic.exam2;

import java.util.Scanner;

public class SwitchTest2 {
	public static void main(String[] args) {
		
		String[] caption = {"가위", "바위", "보"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위는 1, 바위는 2, 보는 3을 입력하세요 > ");
		
		int user = sc.nextInt();
		int pc = (int)(Math.random() * 3) + 1;
		
		System.out.println("you: "+ caption[user-1]);
		System.out.println("pc: "+ caption[pc-1]);
	
		
		switch (user) {
		case 1:
			switch (pc) {
			case 3:
				System.out.println("당신의 승리");
				break;
			case 2:
				System.out.println("com의 승리");
				break;
			case 1:
				System.out.println("무승부");
				break;
			}
			break;
		case 2:
			switch (pc) {
			case 3:
				System.out.println("com의 승리");
				break;
			case 2:
				System.out.println("무승부");
				break;
			case 1:
				System.out.println("당신의 승리");
				break;
			}
			break;
		case 3:
			switch (pc) {
			case 3:
				System.out.println("무승부");
				break;
			case 2:
				System.out.println("당신의 승리");
				break;
			case 1:
				System.out.println("com의 승리");
				break;
			}
		}
		
		
	}
}


    
 
 
 
 
	
