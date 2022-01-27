package study01.exam03;
//���̵� �ο��ϴ� Ŭ����
class Id{
	private static int counter =0;	//���̵� �� �� �ο��ߴ��� ����
	private int id;		//���̵�
	
	//������
	public Id() {
		id = ++counter;
	}
	//���̵� ��ȯ�ϴ� �ν��Ͻ� �޼���
	public int getId() {
		return id;
	}
	//counter�� ��ȯ�ϴ� Ŭ���� �޼���
	public static int getCounter() {
		return counter;
	}
}
public class IdTester {
	public static void main (String[] args){
		Id a = new Id();
		Id b = new Id();
		
		System.out.println("a Id: "+a.getId());
		System.out.println("b Id: "+b.getId());
		
		System.out.println("�ο��� ���̵��� ����: "+Id.getCounter());
	}
}
