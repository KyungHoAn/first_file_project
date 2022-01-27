// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PrimeNumber3.java

package study01.exam02;

import java.io.PrintStream;

public class PrimeNumber3
{

    public PrimeNumber3()
    {
    }

    public static void main(String args[])
    {
        int counter = 0;
        int ptr = 0;
        int prime[] = new int[500];
        prime[ptr++] = 2;
        prime[ptr++] = 3;
        for(int n = 5; n <= 1000; n += 2)
        {
            boolean flag = false;
            for(int i = 1; prime[i] * prime[i] <= n; i++)
            {
                counter += 2;
                if(n % prime[i] != 0)
                    continue;
                flag = true;
                break;
            }

            if(!flag)
            {
                prime[ptr++] = n;
                counter++;
            }
        }

        for(int i = 0; i < ptr; i++)
            System.out.println(prime[i]);

        System.out.println((new StringBuilder("\uACF1\uC148\uACFC \uB098\uB217\uC148\uC744 \uC218\uD589\uD55C \uD68C\uC218: ")).append(counter).toString());
    }
}
