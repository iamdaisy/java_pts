package basic.exam2;

public class DowhileTest {
	public static void main(String[] args) {
		int i,j;
		i = (int)(Math.random()*6) + 1;
		do {
			j = (int) (Math.random() * 6) + 1;
		} while (i == j);                         // 주사위 2개의 숫자가 다를때까지 수행
		
		System.out.println("i =" + i);
		System.out.println("j =" + j);
	
		
		
	
	
	
	}
	
	
	

}
