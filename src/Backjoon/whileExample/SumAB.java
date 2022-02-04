package Backjoon.whileExample;
import java.util.Scanner;
public class SumAB {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			
			if(a ==0 && b==0) {
				stdIn.close();
				break;
			}
			System.out.println(a+b);
		}
	}
}
