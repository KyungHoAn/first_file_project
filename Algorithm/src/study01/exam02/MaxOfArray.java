package study01.exam02;
import java.util.Scanner;

public class MaxOfArray {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=0; i<a.length; i++)
			if(a[i]>max)
				max=a[i];
		return max;
	}
	public static void main(String[] arsg) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.print("��� ��:");
		int num = stdIn.nextInt();
		
		int[] height = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("height["+i+"]:");
			height[i] = stdIn.nextInt();
		}
		
		System.out.println("�ִ���: "+maxOf(height)+"�Դϴ�.");
	}
}
