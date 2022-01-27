// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   IdTester.java

package study01.exam03;


class Id
{

    public Id()
    {
        id = ++counter;
    }

    public int getId()
    {
        return id;
    }

    public static int getCounter()
    {
        return counter;
    }

    private static int counter = 0;
    private int id;

}
