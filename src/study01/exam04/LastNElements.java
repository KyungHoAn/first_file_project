// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   LastNElements.java

package study01.exam04;

import java.io.PrintStream;
import java.util.Scanner;

public class LastNElements
{

    public LastNElements()
    {
    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        int N = 10;
        int a[] = new int[10];
        int cnt = 0;
        System.out.println("\uC815\uC218\uB97C \uC785\uB825\uD558\uC138\uC694");
        int retry;
        do
        {
            System.out.printf("%d\uBC88\uC9F8 \uC815\uC218: ", new Object[] {
                Integer.valueOf(cnt + 1)
            });
            a[cnt++ % 10] = stdIn.nextInt();
            System.out.print("\uACC4\uC18D \uD560\uAE4C\uC694? 1. yes 2.no : ");
            retry = stdIn.nextInt();
        } while(retry == 1);
        int i = cnt - 10;
        if(i < 0)
            i = 0;
        for(; i < cnt; i++)
            System.out.printf("%2d\uBC88\uC9F8\uC758 \uC815\uC218=%d\n", new Object[] {
                Integer.valueOf(i + 1), Integer.valueOf(a[i % 10])
            });

    }
}
