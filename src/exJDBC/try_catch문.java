package exJDBC;

public class try_catch�� {

	public static void main(String[] args) {
		//Java ���� ����Ǵ� ����
		//.java -> ������ -> .class -> ����
		//������ ���� :������ ����
		//��Ÿ�� ���� : ������ �Ǿ� �� �� �ִ� ����(���� ã�� �� (����) / DB / ��Ʈ��ũ ��)
		//try ~ catch(����ó��). ���� 152p
		
		System.out.println("�������");
		System.out.println(2/10);
		System.out.println("����Ϸ�");
		
		
		try { //���α׷� ����
			System.out.println(2/10);
		}catch (Exception e) {
			System.out.println("�����߻�");
			e.printStackTrace();
		
		}finally {
			//try~catch���� �������� ������ ����                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
			System.out.println("try~catch����");
		}
		
	}

}
