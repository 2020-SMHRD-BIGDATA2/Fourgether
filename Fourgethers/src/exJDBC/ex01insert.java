package exJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ex01insert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ID �Է� : ");
		String id = sc.next();
		System.out.print("PW �Է� : ");
		String pw = sc.next();
		System.out.print("NICK �Է� : ");
		String nick = sc.next();

		Connection conn = null;
		PreparedStatement pst = null;

		// 1.oracle ���� �����ϴ� lib������ import

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

			if (conn != null) {
				System.out.println("���Ἲ��");
			} else {
				System.out.println("�������");
			}

			// 4. SQL���� �غ�
			// SQL���� �̻��� ���� �� PrepareStatement ����
			String sql = "insert into member values(?,?,?)";// ?�� ���� id, pw, nick�ڸ���
			pst = conn.prepareStatement(sql);
			pst.setString(1, id); // 0������ �������� ����
			pst.setString(2, pw);
			pst.setString(3, nick);

			// 5. SQL���� ����/ ��� �� ó�� (~�� ����/����)
			int cnt = pst.executeUpdate();

			if (cnt > 0) {
				System.out.println(cnt + "�� ��ɼ���");
			} else {
				System.out.println("��ɽ���");
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
