// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   GenericClassTester.java

package study01.exam03;

import java.io.PrintStream;

public class GenericClassTester
{
    static class GenericClass
    {

        Object getXyz()
        {
            return xyz;
        }

        private Object xyz;

        GenericClass(Object t)
        {
            xyz = t;
        }
    }


    public GenericClassTester()
    {
    }

    public static void main(String args[])
    {
        GenericClass s = new GenericClass("ABC");
        GenericClass n = new GenericClass(Integer.valueOf(15));
        System.out.println((String)s.getXyz());
        System.out.println(n.getXyz());
    }
}
