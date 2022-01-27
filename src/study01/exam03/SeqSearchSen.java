// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SeqSearchSen.java

package study01.exam03;

import java.io.PrintStream;
import java.util.Scanner;

public class SeqSearchSen
{

    public SeqSearchSen()
    {
    }

    static int seqSearchSen(int a[], int n, int key)
    {
        int i = 0;
        for(a[n] = key; a[i] != key; i++);
        return i != n ? i : -1;
    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("\uC694\uC18C\uC218");
        int num = stdIn.nextInt();
        int x[] = new int[num + 1];
        for(int i = 0; i < num; i++)
        {
            System.out.print((new StringBuilder("x[")).append(i).append("]:").toString());
            x[i] = stdIn.nextInt();
        }

        System.out.print("search:");
        int ky = stdIn.nextInt();
        int idx = seqSearchSen(x, num, ky);
        if(idx == -1)
            System.out.println("\uADF8 \uAC12\uC758 \uC694\uC18C\uAC00 \uC5C6\uC2B5\uB2C8\uB2E4.");
        else
            System.out.println((new StringBuilder(String.valueOf(ky))).append(" is x[").append(idx).append("] there it is").toString());
    }
}
