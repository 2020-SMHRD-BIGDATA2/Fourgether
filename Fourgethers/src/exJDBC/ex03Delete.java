package exJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex03Delete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ID �Է� : ");
		String id = sc.next();
		
		Connection conn = null;
		PreparedStatement pst = null;

		try {
			// 2. �����ε�(java�� �����ڰ� � DMBS�� ������� ��)
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// db�ּ�, id, pw // �� �ڽ��� ������ �ּҴ� 127.0.0.1
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "system";
			String dbpw = "12345";

			// 3. DB�� ���� ���� DBID�� DBPW�� �����޴� ����
			DriverManager.getConnection(url, dbid, dbpw);

			// 4. ���������� ������ �޾����� db�� �ڵ鸵�� �� �ִ� Connection ��ü�� ����
			conn = DriverManager.getConnection(url, dbid, dbpw);
			
			//if��������, String sql�� sql�� '���̺� ������ ����' �κ� �����ؼ� ���ڷ� ���� �� , ? �־��ֱ�
			String sql
			= "delete from member where id = ?";

		

			// 4. SQL���� �غ�
			// SQL���� �̻��� ���� �� PrepareStatement ����
			pst = conn.prepareStatement(sql);
			pst.setString(1, id);


			
			// 5. SQL���� ����/ ��� �� ó�� (~�� ����/����)
			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				System.out.println(cnt + "�� ��ɼ���");
			} else {
				System.out.println("��ɽ���");
			}

		} catch (Exception e) {

			e.printStackTrace();

			
		}
		
		

	}

}
