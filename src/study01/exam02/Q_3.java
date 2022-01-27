// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Q_3.java

package study01.exam02;

import java.io.PrintStream;
import java.util.Scanner;

public class Q_3
{

    public Q_3()
    {
    }

    static int sumOf(int a[])
    {
        int sum = 0;
        for(int i = 0; i < a.length; i++)
            sum += a[i];

        return sum;
    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("\uC694\uC18C\uC218\uB294: ");
        int num = stdIn.nextInt();
        int a[] = new int[num];
        for(int i = 0; i < num; i++)
        {
            System.out.print((new StringBuilder("a[")).append(i).append("]:").toString());
            a[i] = stdIn.nextInt();
        }

        System.out.println((new StringBuilder("\uD569\uACC4: ")).append(sumOf(a)).append(".").toString());
    }
}
