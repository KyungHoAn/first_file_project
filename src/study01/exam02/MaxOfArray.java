// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MaxOfArray.java

package study01.exam02;

import java.io.PrintStream;
import java.util.Scanner;

public class MaxOfArray
{

    public MaxOfArray()
    {
    }

    static int maxOf(int a[])
    {
        int max = a[0];
        for(int i = 0; i < a.length; i++)
            if(a[i] > max)
                max = a[i];

        return max;
    }

    public static void main(String arsg[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("\uD0A4\uC758 \uCD5C\uB313\uAC12\uC744 \uAD6C\uD569\uB2C8\uB2E4.");
        System.out.print("\uC0AC\uB78C \uC218:");
        int num = stdIn.nextInt();
        int height[] = new int[num];
        for(int i = 0; i < num; i++)
        {
            System.out.println((new StringBuilder("height[")).append(i).append("]:").toString());
            height[i] = stdIn.nextInt();
        }

        System.out.println((new StringBuilder("\uCD5C\uB313\uAC12\uC740: ")).append(maxOf(height)).append("\uC785\uB2C8\uB2E4.").toString());
    }
}
