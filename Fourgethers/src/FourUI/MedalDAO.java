package FourUI;

public class MedalDAO extends DAO {
	// �� �̿� Ƚ�� �� ��� ����

	public int medal(int count) {
		
		int cnt = 0;
		
		if (count >= 5) {                       //   5  ~ ��� ���  ���� 10 %
			cnt = 3;
		} else if (count >= 3 && count < 5) {   // 3   4    �ǹ� ��� 5%
			cnt = 2;

		} else if (count < 3) {  	             //  1    2
			cnt = 1;

		}
		return cnt;

	}
	
	

}
