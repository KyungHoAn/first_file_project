// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Factorial.java

package study01.exam05;

import java.io.PrintStream;
import java.util.Scanner;

public class Factorial
{

    public Factorial()
    {
    }

    static int factorial(int n)
    {
        if(n > 0)
            return n * factorial(n - 1);
        else
            return 1;
    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("\uC815\uC218\uB97C \uC785\uB825\uD558\uC138\uC694: ");
        int x = stdIn.nextInt();
        System.out.println((new StringBuilder(String.valueOf(x))).append("\uC758 \uD329\uD1A0\uB9AC\uC5BC\uC740 ").append(factorial(x)).append("\uC785\uB2C8\uB2E4.").toString());
    }
}
