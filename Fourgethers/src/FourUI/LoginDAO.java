package FourUI;

public class LoginDAO extends DAO{
	
	int isLogin(UserVO vo){
		String id = vo.getId();
		if(id.isEmpty()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	
	
	
	
}
