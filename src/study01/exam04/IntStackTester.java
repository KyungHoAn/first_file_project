package study01.exam04;
import java.util.Scanner;
//int형 스택의 사용 예시
public class IntStackTester{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntStack s = new IntStack(64);	//최대 64개를 푸쉬할 수 있는 스택
		
		while(true) {
			System.out.println("현재 데이터 수:"+s.size()+"/"+s.capacity());
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
					System.out.println("peek data is"+x+"입니다.");
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