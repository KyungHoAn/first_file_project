package study01.exam04;
import java.util.Scanner;
//���ϴ� ������ŭ ���� �Է� �޾� ��ڼ��� N�� �迭�� ������ N���� ����

public class LastNElements {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final int N = 10;
		int[] a = new int[N];	//�Է¹��� ���� ����
		int cnt = 0;		// �Է� ���� ����
		int retry;		// �ٽ� �ѹ�?
		
		System.out.println("������ �Է��ϼ���");
		
		do {
			System.out.printf("%d��° ����: ",cnt+1);
			a[cnt++ % N] = stdIn.nextInt();
			
			System.out.print("��� �ұ��? 1. yes 2.no : ");
			retry = stdIn.nextInt();
		}while(retry ==1);
		
		int i = cnt-N;
		if(i<0) i=0;
		
		for(;i<cnt;i++)
			System.out.printf("%2d��°�� ����=%d\n",i+1, a[i%N]);
	}
}
