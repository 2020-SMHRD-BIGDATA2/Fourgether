package exJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ex04Select {

	public static void main(String[] args) {
		// member 테이블의 전체 데이터 검색해서 콘솔창에 출력하시오.
		Connection conn = null;
		PreparedStatement pst = null;

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");


			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "system";
			String dbpw = "12345";


			DriverManager.getConnection(url, dbid, dbpw);


			conn = DriverManager.getConnection(url, dbid, dbpw);

			String sql = "select * from member";


			pst = conn.prepareStatement(sql);


			ResultSet rs = pst.executeQuery(); // insert, update, delete, create : executeUpdate()를 사용. 리턴 :  명령에 성공한 횟수.
										// select :  executeQuery(). 리턴 : 검색된 데이터.
			
			while(rs.next()) { // .next :  데이터가 있으면 True, 없으면 False반환
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String nick = rs.getString(3);
				
				System.out.println(id + "\t" + pw + "\t" + nick);
				
			}



		} catch (Exception e) {

			e.printStackTrace();

			
		} finally {

			
			try {
				pst.close();
				conn.close();
				
			}catch (Exception e ) {
				e.printStackTrace();
			}
			
		}
		
		

	}




	}


