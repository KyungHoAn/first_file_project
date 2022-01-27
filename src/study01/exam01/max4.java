// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   max4.java

package study01.exam01;

import java.io.PrintStream;
import java.util.Scanner;

public class max4
{

    public max4()
    {
    }

    static int max4(int a, int b, int c, int d)
    {
        int max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;
        if(d > max)
            max = d;
        return max;
    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("\uB124 \uC815\uC218\uC758 \uCD5C\uB313\uAC12\uC744 \uAD6C\uD569\uB2C8\uB2E4.");
        System.out.print("a\uC758 \uAC12\uFF1A");
        int a = stdIn.nextInt();
        System.out.print("b\uC758 \uAC12\uFF1A");
        int b = stdIn.nextInt();
        System.out.print("c\uC758 \uAC12\uFF1A");
        int c = stdIn.nextInt();
        System.out.print("d\uC758 \uAC12\uFF1A");
        int d = stdIn.nextInt();
        int max = max4(a, b, c, d);
        System.out.println((new StringBuilder("\uCD5C\uB313\uAC12\uC740 ")).append(max).append("\uC785\uB2C8\uB2E4.").toString());
    }
}
