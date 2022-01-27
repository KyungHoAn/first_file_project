// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   IdTester.java

package study01.exam03;

import java.io.PrintStream;

// Referenced classes of package study01.exam03:
//            Id

public class IdTester
{

    public IdTester()
    {
    }

    public static void main(String args[])
    {
        Id a = new Id();
        Id b = new Id();
        System.out.println((new StringBuilder("a Id: ")).append(a.getId()).toString());
        System.out.println((new StringBuilder("b Id: ")).append(b.getId()).toString());
        System.out.println((new StringBuilder("\uBD80\uC5EC\uD55C \uC544\uC774\uB514\uC758 \uAC1C\uC218: ")).append(Id.getCounter()).toString());
    }
}
