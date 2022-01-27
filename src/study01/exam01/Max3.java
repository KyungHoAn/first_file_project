// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Max3.java

package study01.exam01;

import java.io.PrintStream;
import java.util.Scanner;

public class Max3
{

    public Max3()
    {
    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("\uC138 \uC815\uC218\uC758 \uCD5C\uB300\uAC12\uC744 \uAD6C\uD569\uB2C8\uB2E4.");
        System.out.println("value a: ");
        int a = stdIn.nextInt();
        System.out.println("value b: ");
        int b = stdIn.nextInt();
        System.out.println("vlaue c: ");
        int c = stdIn.nextInt();
        int max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;
        System.out.println((new StringBuilder("max value is :")).append(max).append("\uC785\uB2C8\uB2E4.").toString());
    }
}
