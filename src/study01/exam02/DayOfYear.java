// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   DayOfYear.java

package study01.exam02;

import java.io.PrintStream;
import java.util.Scanner;

public class DayOfYear
{

    public DayOfYear()
    {
    }

    static int isLeap(int year)
    {
        return (year % 4 != 0 || year % 100 == 0) && year % 400 != 0 ? 0 : 1;
    }

    static int dayOfYear(int y, int m, int d)
    {
        int days = d;
        for(int i = 1; i < m; i++)
            days += mday[isLeap(y)][i - 1];

        return days;
    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("\uADF8 \uD574 \uACBD\uACFC \uC77C\uC218\uB97C \uAD6C\uD569\uB2C8\uB2E4.");
        int retry;
        do
        {
            System.out.print("\uB144:");
            int year = stdIn.nextInt();
            System.out.print("\uC6D4:");
            int month = stdIn.nextInt();
            System.out.print("\uC77C:");
            int day = stdIn.nextInt();
            System.out.printf("\uADF8 \uD574 %d\uC77C\uC9F8\uC785\uB2C8\uB2E4. \n", new Object[] {
                Integer.valueOf(dayOfYear(year, month, day))
            });
            System.out.println("\uD55C \uBC88 \uB354 \uD560\uAE4C\uC5EC? (1yes, 2, no");
            retry = stdIn.nextInt();
        } while(retry == 1);
    }

    static int mday[][] = {
        {
            31, 28, 30, 31, 30, 31, 31, 30, 31, 30, 
            31
        }, {
            31, 29, 30, 31, 30, 31, 31, 30, 31, 30, 
            31
        }
    };

}
