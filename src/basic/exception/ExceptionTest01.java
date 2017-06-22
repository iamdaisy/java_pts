package basic.exception;

public class ExceptionTest01 {
	public static void main(String[] args) {
		
		String str = null;
		try {
			System.out.println(str.toString());
			
		} catch (NullPointerException | NumberFormatException e) {         // 서브 캐치를 위쪽으로.
			System.out.println("인스턴스 할당이 안됐음");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("무조건 수행");
			
		}
		System.out.println("종료");
	}

}
