// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ArraySumForIn.java

package study01.exam02;

import java.io.PrintStream;

public class ArraySumForIn
{

    public ArraySumForIn()
    {
    }

    public static void main(String args[])
    {
        double a[] = {
            1.0D, 2D, 3D, 4D, 5D
        };
        for(int i = 0; i < a.length; i++)
            System.out.println((new StringBuilder("a[")).append(i).append("]=").append(a[i]).toString());

        double sum = 0.0D;
        double ad[];
        int k = (ad = a).length;
        for(int j = 0; j < k; j++)
        {
            double i = ad[j];
            sum += i;
        }

        System.out.println((new StringBuilder("\uBAA8\uB4E0 \uC694\uC18C\uC758 \uD569\uC740 ")).append(sum).append("\uC785\uB2C8\uB2E4.").toString());
    }
}
