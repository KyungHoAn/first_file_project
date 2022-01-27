// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Q_2.java

package study01.exam02;

import java.io.PrintStream;
import java.util.Scanner;

public class Q_2
{

    public Q_2()
    {
    }

    static void swap(int a[], int idx1, int idx2)
    {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void print(int a[])
    {
        for(int i = 0; i < a.length; i++)
            System.out.print((new StringBuilder(String.valueOf(a[i]))).toString());

        System.out.println();
    }

    static void reverse(int a[])
    {
        print(a);
        for(int i = 0; i < a.length / 2; i++)
        {
            System.out.println((new StringBuilder("a[")).append(i).append("]\uC640 a[").append(a.length - i - 1).append("] \uB97C \uAD50\uD658\uD569\uB2C8\uB2E4.").toString());
            swap(a, i, a.length - i - 1);
            print(a);
        }

    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("\uC694\uC18C\uC218");
        int num = stdIn.nextInt();
        int x[] = new int[num];
        for(int i = 0; i < num; i++)
        {
            System.out.print((new StringBuilder("x[")).append(i).append("]: ").toString());
            x[i] = stdIn.nextInt();
        }

        reverse(x);
        System.out.println("\uC694\uC18C\uB97C \uC5ED\uC21C\uC73C\uB85C \uC815\uB82C\uD588\uC2B5\uB2C8\uB2E4.");
        for(int i = 0; i < num; i++)
            System.out.println((new StringBuilder("x[")).append(i).append("]= ").append(x[i]).toString());

    }
}
