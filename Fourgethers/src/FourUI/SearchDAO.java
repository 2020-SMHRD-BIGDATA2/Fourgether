package FourUI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SearchDAO extends DAO {
	static ArrayList<FCVO> fc_arr = new ArrayList<FCVO>();
	static ArrayList<String> sido = new ArrayList<String>();
	static ArrayList<String> gu = new ArrayList<String>();
	//시도 데이터 생성
	public ArrayList<String> create_sido() {
		getConnection();
		ArrayList<String> G = new ArrayList<String>();
		try {
			String sql = "SELECT DISTINCT SIDO FROM HOLY";

			psmt = conn.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				G.add(rs.getString(1));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		sido = G;
		return G;
	}
	
	//구/동 데이터 생성
	public ArrayList<String> create_gu(String sido) {
		getConnection();
		ArrayList<String> G = new ArrayList<String>();
		try {
			String sql = "SELECT DISTINCT gu FROM HOLY where sido = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1,sido);
			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				G.add(rs.getString(1));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		gu = G;
		return G;
	}
	
	
	

	// 검색창 메소드
	ArrayList<FCVO> key_search(String str) {

		getConnection();

		try {
			String sql = " select * from FC where name LIKE ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "%" + str + "%");
			rs = psmt.executeQuery();
			while (rs.next()) {
				String code = rs.getString(1);
				String name = rs.getString(2);
				String type = rs.getString(3);
				String max_time = rs.getString(4);
				String sum_people = rs.getString(5);
				String ms_sq = rs.getString(6);
				String img_url = rs.getString(7);
				String home_url = rs.getString(8);
				String fee_yn = rs.getString(9);
				String start = rs.getString(10);
				String end = rs.getString(11);
				FCVO fcvo = new FCVO(code, name, type, max_time, sum_people, ms_sq, img_url, home_url, fee_yn, start,
						end);
				fc_arr.add(fcvo);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

		return fc_arr;
	}

	void print(ArrayList<FCVO> fc_arr) {
		for (int i = 0; i < fc_arr.size(); i++) {
			System.out.print(fc_arr.get(i).getCode() + " ");
			System.out.print(fc_arr.get(i).getName() + " ");
			System.out.print(fc_arr.get(i).getType() + " ");
			System.out.print(fc_arr.get(i).getMax_time() + " ");
			System.out.print(fc_arr.get(i).getSum_people() + " ");
			System.out.print(fc_arr.get(i).getMs_sq() + " ");
			System.out.print(fc_arr.get(i).getImg_url() + " ");
			System.out.print(fc_arr.get(i).getHome_url() + " ");
			System.out.print(fc_arr.get(i).getFee_yn() + " ");
			System.out.print(fc_arr.get(i).getStart() + " ");
			System.out.print(fc_arr.get(i).getEnd() + " ");
			System.out.println();
		}
	}

	int detail_info() {
		return 1;
	}

}
