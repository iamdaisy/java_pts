package oop.exam9;

public class SingletonTest {    
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();             // 4. 사용:수행하는 클래스에서 new없는 상태로
		System.out.println(s1 + ": " + s1.hashCode());		// class이름.getter메소드()형태로  인스턴스를 불러와서 참조
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2 + ": " + s2.hashCode());
	
		Singleton s3 = Singleton.getInstance();
		System.out.println(s3 + ": " + s3.hashCode());
	}     

}
