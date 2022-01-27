// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CloneArray.java

package study01.exam02;

import java.io.PrintStream;

public class CloneArray
{

    public CloneArray()
    {
    }

    public static void main(String args[])
    {
        int a[] = {
            1, 2, 3, 4, 5
        };
        int b[] = (int[])a.clone();
        b[3] = 0;
        System.out.print("a = ");
        for(int i = 0; i < a.length; i++)
            System.out.print((new StringBuilder()).append(a[i]).toString());

        System.out.println("b=");
        for(int i = 0; i < b.length; i++)
            System.out.print((new StringBuilder(" ")).append(b[i]).toString());

    }
}
