package study01.exam01;
import java.util.Scanner;

public class Max4_2 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b<max)
			max = b;
		if(c<max)
			max = c;
		if(d<max)
			max = d;
		
		return max;
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("a=");
		a = stdIn.nextInt();
		System.out.println("b=");
		b = stdIn.nextInt();
		System.out.println("c=");
		c = stdIn.nextInt();
		System.out.println("d=");
		d = stdIn.nextInt();
		
		int max = max4(a,b,c,d);
		System.out.println("Max "+max+"ÀÔ´Ï´Ù.");
	}
}
