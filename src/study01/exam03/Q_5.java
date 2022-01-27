// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Q_5.java

package study01.exam03;

import java.io.PrintStream;
import java.util.Scanner;

public class Q_5
{

    public Q_5()
    {
    }

    static int binSearch(int a[], int n, int key)
    {
        int pl = 0;
        int pr = n - 1;
        do
        {
            int pc = (pl + pr) / 2;
            if(a[pc] == key)
            {
                for(; pc > pl; pc--)
                    if(a[pc - 1] < key)
                        break;

                return pc;
            }
            if(a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;
        } while(pl <= pr);
        return -1;
    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("number:");
        int num = stdIn.nextInt();
        int x[] = new int[num];
        System.out.println("\uC624\uB984\uCC28\uC21C\uC73C\uB85C \uC785\uB825\uD558\uC138\uC694.");
        System.out.print("x[0]:");
        x[0] = stdIn.nextInt();
        for(int i = 1; i < num; i++)
            do
            {
                System.out.print((new StringBuilder("x[")).append(i).append("]:").toString());
                x[i] = stdIn.nextInt();
            } while(x[i] < x[i - 1]);

        System.out.print("search value:");
        int ky = stdIn.nextInt();
        int idx = binSearch(x, num, ky);
        if(idx == -1)
            System.out.println("not input value");
        else
            System.out.println((new StringBuilder(String.valueOf(ky))).append("is x[").append(idx).append("].").toString());
    }
}
