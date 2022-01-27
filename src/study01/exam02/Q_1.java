// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Q_1.java

package study01.exam02;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Q_1
{

    public Q_1()
    {
    }

    static int maxOf(int a[])
    {
        int max = a[0];
        for(int i = 1; i < a.length; i++)
            if(a[i] > max)
                max = a[i];

        return max;
    }

    public static void main(String args[])
    {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        System.out.println("\uD0A4\uC758 \uCD5C\uB313\uAC12\uC744 \uAD6C\uD569\uB2C8\uB2E4.");
        int num = 1 + rand.nextInt(20);
        int height[] = new int[num];
        System.out.println((new StringBuilder("people num:")).append(num).toString());
        System.out.println("key value is :");
        for(int i = 0; i < num; i++)
        {
            height[i] = 100 + rand.nextInt(90);
            System.out.println((new StringBuilder("height[")).append(i).append("]:").append(height[i]).toString());
        }

        System.out.println((new StringBuilder("max is ")).append(maxOf(height)).append("that it is").toString());
    }
}
