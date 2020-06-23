import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "system";
			String dbpw = "12345";
			conn = DriverManager.getConnection(url, dbid, dbpw);
					
			String sql = "insert into prov values(? ,?)"; // 테이블명 바꾸기
			pst = conn.prepareStatement(sql);
			pst.setString(1, x);
			pst.setString(2, y);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
