package day1_27;
import java.util.Scanner;
public class Num2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int i=1;
		for(;i<=n;) {
			System.out.println(n);
			n--;
		}
	}
}
