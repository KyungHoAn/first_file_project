package study01.exam04;
import java.util.Scanner;
public class IntStackTester {
	public static void main(String[] args) {
		Scanner stdIn =new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이타 수:"+s.size()+"/" + s.capacity());
			System.out.println("1.push 2.pop 3.pick "+"4 dump 5.exit: ");
			
			int menu = stdIn.nextInt();
			if(menu ==0) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.println("data: ");
				x = stdIn.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e){
					System.out.println("stack is full");
				}
				break;			
				
			case 2:
				try {
					x=s.pop();
					System.out.println("pop data is "+x+".");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("stack is empty");
				}
				break;
				
			case 3:
				try {
					x=s.peek();
					System.out.println("peek data is "+x+".");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("stack is empty");
				}
				break;
				
			case 4:
				s.dump();
				break;
			}
		}
		
	}
}
