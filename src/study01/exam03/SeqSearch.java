// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SeqSearch.java

package study01.exam03;

import java.io.PrintStream;
import java.util.Scanner;

public class SeqSearch
{

    public SeqSearch()
    {
    }

    static int seqSearch(int a[], int n, int key)
    {
        int i = 0;
        do
        {
            if(i == n)
                return -1;
            if(a[i] == key)
                return i;
            i++;
        } while(true);
    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("number: ");
        int num = stdIn.nextInt();
        int x[] = new int[num];
        for(int i = 0; i < num; i++)
        {
            System.out.println((new StringBuilder("a[")).append(i).append("]:").toString());
            x[i] = stdIn.nextInt();
        }

        System.out.print("search value: ");
        int ky = stdIn.nextInt();
        int idx = seqSearch(x, num, ky);
        if(idx == -1)
            System.out.println("not have value");
        else
            System.out.println((new StringBuilder(String.valueOf(ky))).append("is x[").append(idx).append("] there it is").toString());
    }
}
