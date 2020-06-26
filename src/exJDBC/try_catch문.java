package exJDBC;

public class try_catch문 {

	public static void main(String[] args) {
		//Java 파일 실행되는 과정
		//.java -> 컴파일 -> .class -> 실행
		//컴파일 오류 :문법적 오류
		//런타임 오류 : 실행이 되야 알 수 있는 오류(파일 찾을 때 (열기) / DB / 네트워크 등)
		//try ~ catch(예외처리). 교제 152p
		
		System.out.println("실행시작");
		System.out.println(2/10);
		System.out.println("실행완료");
		
		
		try { //프로그램 실행
			System.out.println(2/10);
		}catch (Exception e) {
			System.out.println("오류발생");
			e.printStackTrace();
		
		}finally {
			//try~catch문의 마지막에 무조건 실행                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
			System.out.println("try~catch종료");
		}
		
	}

}
