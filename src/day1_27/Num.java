package day1_27;
import java.util.Scanner;
public class Num {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("자연수 입력: ");
		int n = stdIn.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println(i);
		}
	}
}
