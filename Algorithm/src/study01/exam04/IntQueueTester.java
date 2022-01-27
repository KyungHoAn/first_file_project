package study01.exam04;
import java.util.Scanner;
public class IntQueueTester {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntQueue s = new IntQueue(64);
		
		while(true) {
			System.out.println("현재 데이터 수:"+s.size()+"/"+s.capacity());
			System.out.print("1.inque 2.deque 3.peek 4.dump 5.exit: ");
			
			int menu = stdIn.nextInt();
			if(menu ==0)break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("data:");
				x = stdIn.nextInt();
				try {
					s.enque(x);
				}catch(IntQueue.OverflowIntQueueException e) {
					System.out.println("que is full");
				}
				break;
				
			case 2:
				try {
					x = s.deque();
					System.out.println("deque data is "+x+".");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("queue is empty");
				}
				break;
				
			case 3:
				try {
					x = s.peek();
					System.out.println("peek data is "+x+".");
				}catch(IntQueue.EmptyIntQueueException e) {
					System.out.println("queue is empty");
				}
				break;
				
			case 4:
				s.dump();
				break;
			}
		}
	}
}
