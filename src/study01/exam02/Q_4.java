// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Q_4.java

package study01.exam02;

import java.io.PrintStream;
import java.util.Scanner;

public class Q_4
{

    public Q_4()
    {
    }

    static void copy(int a[], int b[])
    {
        int num = a.length > b.length ? b.length : a.length;
        for(int i = 0; i < num; i++)
            a[i] = b[i];

    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("a\uC758 \uC694\uC19F\uC218: ");
        int numa = stdIn.nextInt();
        int a[] = new int[numa];
        for(int i = 0; i < numa; i++)
        {
            System.out.print((new StringBuilder("a[")).append(i).append("]:").toString());
            a[i] = stdIn.nextInt();
        }

        System.out.print("b\uC758 \uC694\uC19F\uC218: ");
        int numb = stdIn.nextInt();
        int b[] = new int[numb];
        for(int i = 0; i < numb; i++)
        {
            System.out.print((new StringBuilder("b[")).append(i).append("]:").toString());
            b[i] = stdIn.nextInt();
        }

        copy(a, b);
        System.out.println("\uBC30\uC5F4 b\uC758 \uBAA8\uB4E0 \uC694\uC18C\uB97C \uBC30\uC5F4 a\uC5D0 \uBCF5\uC0AC");
        for(int i = 0; i < numa; i++)
            System.out.println((new StringBuilder("a[")).append(i).append("]=").append(a[i]).toString());

    }
}
