package oop.exam9;

public class Singleton {
	private static Singleton singleton = new Singleton();  // 2. 자기 자신의 인스턴스를 참조하는 공유변수를 선언. 
	private Singleton(){}                                 //1. 외부에서 인스턴스 생성을 금지하도록 private
	
	public static Singleton getInstance() {                //3. 공유변수를 리턴하는 getter 메소드작성
		return singleton;
	}
	
	
	@Override
	public String toString() {
		return "포기하는 그 순간 시험종료다!";
		
	}

}
