package exJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex03Delete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 ID 입력 : ");
		String id = sc.next();
		
		Connection conn = null;
		PreparedStatement pst = null;

		try {
			// 2. 동적로딩(java는 개발자가 어떤 DMBS를 사용할지 모름)
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// db주소, id, pw // 내 자신의 아이피 주소는 127.0.0.1
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "system";
			String dbpw = "12345";

			// 3. DB로 가서 실제 DBID와 DBPW를 인증받는 절차
			DriverManager.getConnection(url, dbid, dbpw);

			// 4. 성공적으로 인증을 받았으면 db를 핸들링할 수 있는 Connection 객체를 리턴
			conn = DriverManager.getConnection(url, dbid, dbpw);
			
			//if문지웠고, String sql에 sql의 '테이블에 데이터 수정' 부분 복붙해서 일자로 만든 후 , ? 넣어주기
			String sql
			= "delete from member where id = ?";

		

			// 4. SQL문을 준비
			// SQL문에 이상이 없을 때 PrepareStatement 리턴
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);


			
			// 5. SQL문을 실행/ 명령 후 처리 (~개 성공/실패)
			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				System.out.println(cnt + "개 명령성공");
			} else {
				System.out.println("명령실패");
			}

		} catch (Exception e) {

			e.printStackTrace();

			
		}
		
		

	}

}
