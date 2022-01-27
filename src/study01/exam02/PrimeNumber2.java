// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrimeNumber2.java

package study01.exam02;

import java.io.PrintStream;

public class PrimeNumber2
{

    public PrimeNumber2()
    {
    }

    public static void main(String args[])
    {
        int counter = 0;
        int ptr = 0;
        int prime[] = new int[500];
        prime[ptr++] = 2;
        for(int n = 3; n <= 1000; n += 2)
        {
            int i;
            for(i = 1; i < ptr; i++)
            {
                counter++;
                if(n % prime[i] == 0)
                    break;
            }

            if(ptr == i)
                prime[ptr++] = n;
        }

        for(int i = 0; i < ptr; i++)
            System.out.println(prime[i]);

        System.out.println((new StringBuilder("\uB098\uB217\uC148\uC744 \uC218\uD589\uD55C \uD69F\uC218: ")).append(counter).toString());
    }
}
