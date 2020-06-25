package FourUI;

public class MedalDAO extends DAO {
	// 월 이용 횟수 별 등급 차이

	public int medal(int count) {
		
		int cnt = 0;
		
		if (count >= 5) {                       //   5  ~ 골드 등급  할인 10 %
			cnt = 3;
		} else if (count >= 3 && count < 5) {   // 3   4    실버 등급 5%
			cnt = 2;

		} else if (count < 3) {  	             //  1    2
			cnt = 1;

		}
		return cnt;

	}
	
	

}
