package basic.exam;

public class ConversionTest {
	public static void main(String[] args) {
		double d = 10;				 // 자동형변환(묵시적 형변환)
		System.out.println(d);
		
//		int i = 3.14;		        데이터를 잃으니까 명시적으로 형변환 해야함
//									버림 (반올림X)
//		int i = (int)3.994;         강제 형변환(명시적 형변환)
//		System.out.println(i);
		
//       Math.random()                   양수로만 리턴 0.0보다 크거나 같고 1.0보다 작음
//		(int)(Math.random() * 6) + 1;    나올수있는 가지수로 곱함 (1~6 주사위)
	

		int n1 = (int) ((Math.random() * 12) + 4);
		System.out.println(n1);
		int n2 = (int) ((Math.random() * 17 ) + 6) * 100;
		System.out.println(n2);
	}
}
