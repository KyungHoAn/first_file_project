// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SeqSearch2.java

package study01.exam03;

import java.io.PrintStream;
import java.util.Scanner;

public class SeqSearch2
{

    public SeqSearch2()
    {
    }

    static int seqSearch(int a[], int n, int key)
    {
        for(int i = 0; i < n; i++)
            if(a[i] == key)
                return i;

        return -1;
    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("number: ");
        int num = stdIn.nextInt();
        int x[] = new int[num];
        for(int i = 0; i < num; i++)
        {
            System.out.print((new StringBuilder("x[")).append(i).append("]:").toString());
            x[i] = stdIn.nextInt();
        }

        System.out.print("search value: ");
        int ky = stdIn.nextInt();
        int idx = seqSearch(x, num, ky);
        if(idx == -1)
            System.out.println("not input value");
        else
            System.out.println((new StringBuilder(String.valueOf(ky))).append(" is x[").append(idx).append("] there it is").toString());
    }
}
