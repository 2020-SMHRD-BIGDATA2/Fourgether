package FourUI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class SearchDAO extends DAO {
	static ArrayList<FCVO> fc_arr = new ArrayList<FCVO>();
	static ArrayList<String> sido = new ArrayList<String>();
	static ArrayList<String> gu = new ArrayList<String>();
	static ArrayList<String> FcType = new ArrayList<String>();
	
	
	
	
	
	
	// 시도 데이터 생성
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

	// 구/동 데이터 생성
	public ArrayList<String> create_gu(String sido) {
		getConnection();
		ArrayList<String> G = new ArrayList<String>();
		try {
			String sql = "SELECT DISTINCT gu FROM HOLY where sido = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, sido);
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

	public ArrayList<String> create_type() {
		getConnection();
		ArrayList<String> type = new ArrayList<String>();
		try {
			String sql = "SELECT distinct * from shittype";

			psmt = conn.prepareStatement(sql);

			ResultSet rs = psmt.executeQuery();
			while (rs.next()) {
				type.add(rs.getString(1));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		FcType = type;
		return type;
	}

	// 검색창 메소드
	ArrayList<FCVO> key_search(String str) {

		getConnection();

		try {
			String sql = "select * from FC where name LIKE ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "%" + str + "%");
			rs = psmt.executeQuery();
			fc_arr = null;
			fc_arr = new ArrayList<FCVO>();

			if (rs.next() == true) {
				while (rs.next()) {
					String code = rs.getString(1);
					String name = rs.getString(2);
					String type1 = rs.getString(3);
					String max_time = rs.getString(4);
					String sum_people = rs.getString(5);
					String ms_sq = rs.getString(6);
					String img_url = rs.getString(7);
					String home_url = rs.getString(8);
					String fee_yn = rs.getString(9);
					String start = rs.getString(10);
					String end = rs.getString(11);
					String lat = rs.getString(12);
					String lon = rs.getString(13);
					String addr_new = rs.getString(14);
					String ph_num = rs.getString(15);
					String dp_name = rs.getString(16);
					String ar_name = rs.getString(17);
					FCVO fcvo = new FCVO(code, name, type1, max_time, sum_people, ms_sq, img_url, home_url, fee_yn,
							start, end, lat, lon, addr_new, ph_num, dp_name, ar_name);
					fc_arr.add(fcvo);
				}

			} else if (rs.next() == false) {
				JOptionPane.showMessageDialog(null, "검색내용이없어요!", "검색오류", JOptionPane.INFORMATION_MESSAGE);
				Search.main(null);

			}

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close();
		}

		return fc_arr;
	}

	// 카테고리 검색
	ArrayList<FCVO> key_search(String sido, String gu, String type, String yn) {

		getConnection();

		try {
			fc_arr = null;
			fc_arr = new ArrayList<FCVO>();
			String sql = "";
			if(yn.equals("Y")) {
				sql = "SELECT * from FC where addr_new LIKE ? AND addr_new LIKE ? AND type LIKE ? AND fee_yn != '0'";
			}else {
				sql = "SELECT * from FC where addr_new LIKE ? AND addr_new LIKE ? AND type LIKE ? AND fee_yn = '0'";
			}
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "%" + sido + "%");
			psmt.setString(2, "%" + gu + "%");
			psmt.setString(3, "%" + type + "%");
			
			rs = psmt.executeQuery();
			while (rs.next()) {
				String code = rs.getString(1);
				String name = rs.getString(2);
				String type1 = rs.getString(3);
				String max_time = rs.getString(4);
				String sum_people = rs.getString(5);
				String ms_sq = rs.getString(6);
				String img_url = rs.getString(7);
				String home_url = rs.getString(8);
				String fee_yn = rs.getString(9);
				String start = rs.getString(10);
				String end = rs.getString(11);
				String lat = rs.getString(12);
				String lon = rs.getString(13);
				String addr_new = rs.getString(14);
				String ph_num = rs.getString(15);
				String dp_name = rs.getString(16);
				String ar_name = rs.getString(17);
				FCVO fcvo = new FCVO(code, name, type1, max_time, sum_people, ms_sq, img_url, home_url, fee_yn, start,
						end, lat, lon, addr_new, ph_num, dp_name, ar_name);
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
			System.out.print(fc_arr.get(i).getLat() + " ");
			System.out.print(fc_arr.get(i).getLon() + " ");
			System.out.print(fc_arr.get(i).getAddr_new() + " ");
			System.out.print(fc_arr.get(i).getPh_num() + " ");
			System.out.print(fc_arr.get(i).getDp_name() + " ");
			System.out.print(fc_arr.get(i).getAr_name() + " ");
			System.out.println();
		}
	}

	// SearchResult 값 초기화

	void ListReset() {

		JLabel txt_list_1_1 = new JLabel(" ");
		JLabel txt_list_1_2 = new JLabel(" ");
		JLabel txt_list_1_3 = new JLabel(" ");
		JLabel txt_list_1_4 = new JLabel(" ");
		JLabel txt_list_2_1 = new JLabel(" ");
		JLabel txt_list_2_2 = new JLabel(" ");
		JLabel txt_list_2_3 = new JLabel(" ");
		JLabel txt_list_2_4 = new JLabel(" ");
		JLabel txt_list_3_1 = new JLabel(" ");

	}

	int detail_info() {
		return 1;
	}

}
