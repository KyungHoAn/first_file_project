package Backjoon.ForExample;

import java.util.Scanner;

public class ForStar {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int num = stdIn.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
