package FourUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ResisterDAO {
	Connect connect = new Connect();
   private Connection conn;
   private PreparedStatement psmt;
   // DB 연결 메소드
   private void getConnection() {

      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
         String db_id = "temp";
         String db_pw = "temp";
         try {
            conn = DriverManager.getConnection(db_url, db_id, db_pw);
         } catch (SQLException e) {

            e.printStackTrace();
         }
      } catch (ClassNotFoundException e) {

         e.printStackTrace();
      }

   }
   // 닫아 주는 메소드
   private void close() {

      try {
         if (psmt != null) {
            psmt.close();
         }
         if (conn != null) {
            conn.close();
         }

      } catch (SQLException e) {

         e.printStackTrace();
      }

   }

   // 회원 가입 메소드
   public int join(ResisterVO vo) {
      int cnt = 0;

      getConnection();

      try {
         String sql = "INSERT INTO USERS VALUES(?,?,?,?,?,?)";
         psmt = conn.prepareStatement(sql);
         psmt.setString(1, vo.getId());
         psmt.setString(2, vo.getPw());
         psmt.setString(3, vo.getName());
         psmt.setInt(4, vo.getPv_num());
         psmt.setString(5, vo.getPh_num());
         psmt.setString(6, vo.getAddr());
         cnt = psmt.executeUpdate();
      } catch (SQLException e) {

         e.printStackTrace();
      } finally {
         close();
      }
      return cnt;

   }

   }