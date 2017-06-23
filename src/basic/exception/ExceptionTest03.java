package basic.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ExceptionTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("id: ");
		String user_id = sc.nextLine();
		System.out.println("pw: ");
		String user_pw = sc.nextLine();

		MemberV0 userInfo = new MemberV0();
		userInfo.setUser_id(user_id);
		userInfo.setUser_pw(user_pw);

		try {
			userInfo = login(userInfo);
			System.out.println(userInfo.getUser_name() + "님이 로그인 하셨습니다.");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());

		}

	}

	private static MemberV0 login(MemberV0 userInfo) throws Exception {
		// JDBC 3총사
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT user_name ");
		sql.append(" FROM   t_mem ");
		sql.append(" WHERE  user_id = ?");		 //parameter query
		sql.append(" and    user_pw = ?");
		
		try {
			//jdbc가 존재하는지 알아봄
			Class.forName("oracle.jdbc.OracleDriver");
			
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "bigdata", "bigdata");
			
			st = cn.prepareStatement(sql.toString());
			st.setString(1, userInfo.getUser_id());
			st.setString(2, userInfo.getUser_pw());
			rs = st.executeQuery();
			if (rs.next()) {
				userInfo.setUser_name(rs.getString("user_name"));
				return userInfo;
			} else {
				throw new LoginFailException("아이디 혹은 비밀번호가 틀립니다.", userInfo);
			} 
		} finally {
			if (rs != null) try {rs.close();} catch(Exception e) {}
			if (st != null) try {st.close();} catch(Exception e) {}
			if (cn != null) try {cn.close();} catch(Exception e) {}
			}
			
				
		/*
		if (userInfo.getUser_id().equals("multi") && 
			userInfo.getUser_pw().equals("fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff1226583e88e0996293f16bc009c652826e0fc5c706695a03cddce372f139eff4d13959da6f1f5d3eabe")) {
			userInfo.setUser_name("제이비");
			return userInfo;
		} else {
			throw new LoginFailException("아이디 혹은 비밀번호가 틀릴걸요?", userInfo);
		}*/
	}

}
