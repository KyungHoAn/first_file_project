// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Max4_2.java

package study01.exam01;

import java.io.PrintStream;
import java.util.Scanner;

public class Max4_2
{

    public Max4_2()
    {
    }

    static int max4(int a, int b, int c, int d)
    {
        int max = a;
        if(b < max)
            max = b;
        if(c < max)
            max = c;
        if(d < max)
            max = d;
        return max;
    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("a=");
        int a = stdIn.nextInt();
        System.out.println("b=");
        int b = stdIn.nextInt();
        System.out.println("c=");
        int c = stdIn.nextInt();
        System.out.println("d=");
        int d = stdIn.nextInt();
        int max = max4(a, b, c, d);
        System.out.println((new StringBuilder("Max ")).append(max).append("\uC785\uB2C8\uB2E4.").toString());
    }
}
