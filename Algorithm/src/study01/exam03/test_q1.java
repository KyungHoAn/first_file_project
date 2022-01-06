package study01.exam03;
import java.util.Scanner;

public class test_q1 {
	static int seqSearchSen(int[] a, int n, int key) {
		int i=0;
		
		a[n] = key;
		
		for(;a[i]==key;) {
			
		}
		
//		while(true) {
//			if(a[i] == key)
//				break;
//			i++;
//		}
		return i ==n ? -1: i;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("¿ä¼Ò¼ö:");
		int num = stdIn.nextInt();
		int x[] = new int[num+1];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i]= stdIn.nextInt();
		}
		
		System.out.print("search: ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(x,num,ky);
		
		if(idx == -1)
			System.out.println("not input value");
		else
			System.out.println(ky+"is x["+idx+"] there it is");
	}
}
