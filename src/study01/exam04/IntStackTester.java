package study01.exam04;
import java.util.Scanner;
//int�� ������ ��� ����
public class IntStackTester{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);	//�ִ� 64���� Ǫ���� �� �ִ� ����
		
		while(true) {
			System.out.println("���� ������ ��:"+s.size()+"/"+s.capacity());
			System.out.print("1.push 2.pop 3.peek 4.dump 5.exit:");
			
			int menu = stdIn.nextInt();
			if(menu == 0)break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("data: ");
				x = stdIn.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("stack is full");
				}
				break;
				
			case 2:
				try {
					x = s.pop();
					System.out.println("pop data is"+x+".");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("stack is empty");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("peek data is"+x+"�Դϴ�.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("stack is emtpy");
				}
				break;
				
			case 4:
				s.dump();
				break;
			}
		}
	}
}