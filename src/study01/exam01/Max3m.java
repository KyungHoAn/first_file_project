// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Max3m.java

package study01.exam01;

import java.io.PrintStream;

public class Max3m
{

    public Max3m()
    {
    }

    static int max3(int a, int b, int c)
    {
        int max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;
        return max;
    }

    public static void main(String args[])
    {
        System.out.println((new StringBuilder("max(3,2,1) =")).append(max3(3, 2, 1)).toString());
        System.out.println((new StringBuilder("max(3,2,1) =")).append(max3(6, 2, 4)).toString());
        System.out.println((new StringBuilder("max(3,2,1) =")).append(max3(0, 1, 0)).toString());
        System.out.println((new StringBuilder("max(3,2,1) =")).append(max3(3, 2, 9)).toString());
        System.out.println((new StringBuilder("max(3,2,1) =")).append(max3(3, 2, 1)).toString());
        System.out.println((new StringBuilder("max(3,2,1) =")).append(max3(3, 2, 1)).toString());
        System.out.println((new StringBuilder("max(3,2,1) =")).append(max3(3, 2, 1)).toString());
        System.out.println((new StringBuilder("max(3,2,1) =")).append(max3(3, 2, 1)).toString());
        System.out.println((new StringBuilder("max(3,2,1) =")).append(max3(3, 2, 1)).toString());
        System.out.println((new StringBuilder("max(3,2,1) =")).append(max3(3, 2, 1)).toString());
    }
}
