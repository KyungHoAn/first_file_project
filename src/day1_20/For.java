package day1_20;
import java.util.Scanner;
public class For {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		int arr[] = new int[num];
		
		for(int i=0; i<num; i++) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			arr[i] = a+b;
		}
		for(int k: arr) {
			System.out.println(k);
		}
	}
}
