// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Median.java

package study01.exam01;

import java.io.PrintStream;
import java.util.Scanner;

public class Median
{

    public Median()
    {
    }

    static int med3(int a, int b, int c)
    {
        if(a >= b)
        {
            if(b >= c)
                return b;
            if(a <= c)
                return a;
            else
                return c;
        }
        if(a > c)
            return a;
        if(b > c)
            return c;
        else
            return b;
    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("\uC138 \uAC12\uC758 \uC911\uC559\uAC12\uC744 \uAD6C\uD569\uB2C8\uB2E4.");
        System.out.println("a\uC758 \uAC12");
        int a = stdIn.nextInt();
        System.out.println("b\uC758 \uAC12");
        int b = stdIn.nextInt();
        System.out.println("c\uC758 \uAC12");
        int c = stdIn.nextInt();
        System.out.println((new StringBuilder("\uC911\uC544\uAC12\uC740 ")).append(med3(a, b, c)).append("\uC785\uB2C8\uB2E4.").toString());
    }
}
