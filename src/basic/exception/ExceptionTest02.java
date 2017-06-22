package basic.exception;

public class ExceptionTest02 {
	public static void main(String[] args) {
		try {
			throwException();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("종료");
	}
	
	
	private static void throwException() throws Exception {       // 이블럭 안에서 예외처리 안하겠다 try catch 사용하는곳에서 예외ㅌ처리		
	
			String str = null;
			System.out.println(str.toString());
			System.out.println("throwException 종료");
	}

}
