package study01.exam05;
import java.util.Scanner;
//factorial 구하기
//음이 아닌 정수 n의 팩토리얼(n!)는 재귀적으로 정의할 수 있다.
// 0!=1
// n>0이면 n! = n x (n-1)!
// ex) 10! = 10 x 9!
//팩토리얼을 재귀적으로 구현

public class Factorial {
	//양의 정수 n의 팩토리얼을 반환합니다.
	static int factorial(int n) {
		if(n>0)
			return n*factorial(n-1);
		else
			return 1;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int x = stdIn.nextInt();
		
		System.out.println(x+"의 팩토리얼은 "+factorial(x)+"입니다.");
	}
}
