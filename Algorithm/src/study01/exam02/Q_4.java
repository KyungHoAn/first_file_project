package study01.exam02;
import java.util.Scanner;

public class Q_4 {
	static void copy(int[] a, int [] b) {
		int num = a.length <=b.length ?a.length:b.length;
		for(int i=0; i<num; i++)
			a[i] =b[i];
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("a�� ��ڼ�: ");
		int numa = stdIn.nextInt();
		int a[] = new int[numa];
		for(int i=0; i<numa; i++) {
			System.out.print("a["+i+"]:");
			a[i] =stdIn.nextInt();
		}
		
		System.out.print("b�� ��ڼ�: ");
		int numb = stdIn.nextInt();
		int[] b = new int[numb];
		for(int i=0; i<numb; i++) {
			System.out.print("b["+i+"]:");
			b[i] = stdIn.nextInt();
		}
		copy(a,b);
		System.out.println("�迭 b�� ��� ��Ҹ� �迭 a�� ����");
		for(int i=0; i<numa; i++)
			System.out.println("a["+i+"]="+a[i]);
	}
}
