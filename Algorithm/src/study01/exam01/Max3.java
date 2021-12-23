package study01.exam01;
import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최대값을 구합니다.");
		System.out.println("value a: "); int a = stdIn.nextInt();
		System.out.println("value b: "); int b = stdIn.nextInt();
		System.out.println("vlaue c: "); int c = stdIn.nextInt();
		int max =a;
		if (b>max) max = b;
		if (c>max) max =c;
		
		System.out.println("max value is :"+max+"입니다.");
	}
}
