package study01.exam02;
import java.util.Scanner;
//배열 요소의 합을 출력
public class Q_3 {
	static int sumOf(int[] a) {
		int sum=0;
		for(int i=0; i<a.length; i++) 
			sum+=a[i];
		return (sum);
	}
	public static void main(String[] args) {
		Scanner stdIn  = new Scanner(System.in);
		
		System.out.print("요소수는: ");
		int num = stdIn.nextInt();
		int[] a = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("a["+i+"]:");
			a[i] = stdIn.nextInt();
		}
		System.out.println("합계: "+sumOf(a)+".");
	}
}
