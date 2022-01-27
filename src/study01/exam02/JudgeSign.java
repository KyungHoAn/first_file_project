// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   JudgeSign.java

package study01.exam02;

import java.io.PrintStream;
import java.util.Scanner;

public class JudgeSign
{

    public JudgeSign()
    {
    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("\uC815\uC218\uB97C \uC785\uB825\uD558\uC138\uC694: ");
        int n = stdIn.nextInt();
        if(n > 0)
            System.out.println("\uC774 \uC218\uB294 \uC591\uC218\uC785\uB2C8\uB2E4.");
        else
        if(n < 0)
            System.out.println("\uC774 \uC218\uB294 \uC74C\uC218\uC785\uB2C8\uB2E4.");
        else
            System.out.println("\uC774 \uC218\uB294 0\uC785\uB2C8\uB2E4. ");
    }
}
