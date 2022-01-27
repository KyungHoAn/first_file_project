// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrimeNumber1.java

package study01.exam02;

import java.io.PrintStream;

public class PrimeNumber1
{

    public PrimeNumber1()
    {
    }

    public static void main(String args[])
    {
        int counter = 0;
        for(int n = 2; n <= 1000; n++)
        {
            int i;
            for(i = 2; i < n; i++)
            {
                counter++;
                if(n % i == 0)
                    break;
            }

            if(n == i)
                System.out.println(n);
        }

        System.out.println((new StringBuilder("\uB098\uB217\uC148\uC744 \uC9C4\uD589\uD55C \uD69F\uC218")).append(counter).toString());
    }
}
