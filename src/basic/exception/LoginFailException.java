package basic.exception;

import java.io.FileWriter;

public class LoginFailException extends RuntimeException {
	
	public LoginFailException(String error_msg, MemberV0 memberV0) {
		super(error_msg);
		
		try {
			FileWriter fw = new FileWriter("log.txt", true);
			fw.write("아래와 같은 로그인 시도가 있었음\n");
			fw.write(memberV0.toString() + "\n");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
