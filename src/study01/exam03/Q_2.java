// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Q_2.java

package study01.exam03;

import java.io.PrintStream;
import java.util.Scanner;

public class Q_2
{

    public Q_2()
    {
    }

    static int seqSearchEx(int a[], int n, int key)
    {
        System.out.print("  |");
        for(int k = 0; k < n; k++)
            System.out.printf("%4d", new Object[] {
                Integer.valueOf(k)
            });

        System.out.println();
        System.out.print("---+");
        for(int k = 0; k < 4 * n + 2; k++)
            System.out.print("-");

        System.out.println();
        for(int i = 0; i < n; i++)
        {
            System.out.print("  |");
            System.out.printf(String.format("%%%ds*\n", new Object[] {
                Integer.valueOf(i * 4 + 3)
            }), new Object[] {
                ""
            });
            System.out.printf("%3d|", new Object[] {
                Integer.valueOf(i)
            });
            for(int k = 0; k < n; k++)
                System.out.printf("%4d", new Object[] {
                    Integer.valueOf(a[k])
                });

            System.out.println("\n  |");
            if(a[i] == key)
                return i;
        }

        return -1;
    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("number:");
        int num = stdIn.nextInt();
        int x[] = new int[num];
        for(int i = 0; i < num; i++)
        {
            System.out.print((new StringBuilder("x[")).append(i).append("]:").toString());
            x[i] = stdIn.nextInt();
        }

        System.out.print("search value:");
        int ky = stdIn.nextInt();
        int idx = seqSearchEx(x, num, ky);
        if(idx == -1)
            System.out.println("not input value");
        else
            System.out.println((new StringBuilder(String.valueOf(ky))).append("input x[").append(idx).append("].").toString());
    }
}
