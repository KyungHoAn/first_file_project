package study01.exam05;
import java.util.Scanner;
//factorial ���ϱ�
//���� �ƴ� ���� n�� ���丮��(n!)�� ��������� ������ �� �ִ�.
// 0!=1
// n>0�̸� n! = n x (n-1)!
// ex) 10! = 10 x 9!
//���丮���� ��������� ����

public class Factorial {
	//���� ���� n�� ���丮���� ��ȯ�մϴ�.
	static int factorial(int n) {
		if(n>0)
			return n*factorial(n-1);
		else
			return 1;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int x = stdIn.nextInt();
		
		System.out.println(x+"�� ���丮���� "+factorial(x)+"�Դϴ�.");
	}
}
