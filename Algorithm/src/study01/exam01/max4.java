package study01.exam01;
import java.util.Scanner;
public class max4 {
	// a, b, c, d�� �ִ��� ���Ͽ� ��ȯ
		static int max4(int a, int b, int c, int d) {
			int max = a; 	// �ִ�
			if (b > max)
				max = b;
			if (c > max)
				max = c;
			if (d > max)
				max = d;

			return max;
		}

		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			int a, b, c, d;

			System.out.println("�� ������ �ִ��� ���մϴ�.");
			System.out.print("a�� ����");
			a = stdIn.nextInt();
			System.out.print("b�� ����");
			b = stdIn.nextInt();
			System.out.print("c�� ����");
			c = stdIn.nextInt();
			System.out.print("d�� ����");
			d = stdIn.nextInt();

			int max = max4(a, b, c, d); 	// a, b, c, d�� �ִ�

			System.out.println("�ִ��� " + max + "�Դϴ�.");
		}
}
