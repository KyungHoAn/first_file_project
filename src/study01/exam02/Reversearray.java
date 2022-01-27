// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Reversearray.java

package study01.exam02;

import java.io.PrintStream;
import java.util.Scanner;

public class Reversearray
{

    public Reversearray()
    {
    }

    static void swap(int a[], int idx1, int idx2)
    {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int a[])
    {
        for(int i = 0; i < a.length / 2; i++)
            swap(a, i, a.length - i - 1);

    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("\uC694\uC18C\uC218");
        int num = stdIn.nextInt();
        int x[] = new int[num];
        for(int i = 0; i < num; i++)
        {
            System.out.print((new StringBuilder("x[")).append(i).append("]:").toString());
            x[i] = stdIn.nextInt();
        }

        reverse(x);
        System.out.println("\uC694\uC18C\uB97C \uC5ED\uC21C\uC73C\uB85C \uC815\uB82C\uD588\uC2B5\uB2C8\uB2E4.");
        for(int i = 0; i < num; i++)
            System.out.println((new StringBuilder("x[")).append(i).append("]=").append(x[i]).toString());

    }
}
