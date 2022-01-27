// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ntArrayInit.java

package study01.exam02;

import java.io.PrintStream;

public class ntArrayInit
{

    public ntArrayInit()
    {
    }

    public static void main(String args[])
    {
        int a[] = {
            1, 2, 3, 4, 5
        };
        for(int i = 0; i < a.length; i++)
            System.out.println((new StringBuilder("a[")).append(i).append("]=").append(a[i]).toString());

        System.out.println(a);
    }
}
