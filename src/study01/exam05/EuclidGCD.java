// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   EuclidGCD.java

package study01.exam05;

import java.io.PrintStream;
import java.util.Scanner;

public class EuclidGCD
{

    public EuclidGCD()
    {
    }

    static int gcd(int x, int y)
    {
        if(y == 0)
            return x;
        else
            return gcd(y, x % y);
    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("\uB450 \uC815\uC218\uC758 \uCD5C\uB300\uACF5\uC57D\uC218\uB97C \uAD6C\uD569\uB2C8\uB2E4.");
        System.out.print("\uC815\uC218\uB97C \uC785\uB825\uD558\uC138\uC694: ");
        int x = stdIn.nextInt();
        System.out.print("\uC815\uC218\uB97C \uC785\uB825\uD558\uC138\uC694: ");
        int y = stdIn.nextInt();
        System.out.println((new StringBuilder("\uCD5C\uB300\uACF5\uC57D\uC218\uB294 ")).append(gcd(x, y)).append("\uC785\uB2C8\uB2E4.").toString());
    }
}
