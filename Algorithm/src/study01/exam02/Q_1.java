package study01.exam02;
import java.util.Random;
import java.util.Scanner;
//문제Q1 = 키 뿐만 아니라 사람 수도 난수로 생성하도록 MaxOfArrayRand를 수정하여 프로그램을 작성하시오.
public class Q_1 {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++) 
			if(a[i]>max)
				max = a[i];
		return max;				
	}
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		int num = 1+rand.nextInt(20);
		int[] height = new int[num];
		System.out.println("people num:" +num);
		
		
		System.out.println("key value is :");
		for(int i=0; i<num; i++) {
			height[i] = 100+rand.nextInt(90);
			System.out.println("height["+i+"]:"+height[i]);
		}
		System.out.println("max is "+maxOf(height)+"that it is");
	}
}

