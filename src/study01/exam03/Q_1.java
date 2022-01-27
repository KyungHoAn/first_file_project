// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Q_1.java

package study01.exam03;

import java.io.PrintStream;
import java.util.Scanner;

public class Q_1
{

    public Q_1()
    {
    }

    static int seqSearchSen(int a[], int n, int key)
    {
        int i = 0;
        a[n] = key;
        for(i = 0; i < n; i++)
            if(a[i] == key)
                return i;

        return -1;
    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("number: ");
        int num = stdIn.nextInt();
        int x[] = new int[num + 1];
        for(int i = 0; i < num; i++)
        {
            System.out.print((new StringBuilder("x[")).append(i).append("]:").toString());
            x[i] = stdIn.nextInt();
        }

        System.out.print("search value: ");
        int ky = stdIn.nextInt();
        int idx = seqSearchSen(x, num, ky);
        if(idx == -1)
            System.out.println("not input value");
        else
            System.out.println((new StringBuilder(String.valueOf(ky))).append("is input x[").append(idx).append("].").toString());
    }
}
