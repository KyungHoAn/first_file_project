// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EuclidGCD.java

package study01.exam05;
import java.util.Scanner;
// ��Ŭ���� ȣ�������� �ִ����� ���ϱ�
public class EuclidGCD {
	static int gcd(int x, int y) {
		if(y==0)
			return x;
		else
			return gcd(y,x%y);
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ������� ���մϴ�.");
		
		System.out.print("������ �Է��ϼ���: ");
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		
		System.out.println("�ִ������� "+gcd(x,y)+"�Դϴ�.");
	}
}