// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   CardConvRev.java

package study01.exam02;

import java.io.PrintStream;
import java.util.Scanner;

public class CardConvRev
{

    public CardConvRev()
    {
    }

    static int cardConvR(int x, int r, char d[])
    {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        do
        {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while(x != 0);
        return digits;
    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        char cno[] = new char[32];
        System.out.println("10\uC9C4\uC218\uB97C \uAE30\uC218 \uBCC0\uD658\uD569\uB2C8\uB2E4.");
        int retry;
        do
        {
            int no;
            do
            {
                System.out.println("\uBCC0\uD658\uD558\uB294 \uC74C\uC774 \uC544\uB2CC \uC815\uC218:");
                no = stdIn.nextInt();
            } while(no < 0);
            int cd;
            do
            {
                System.out.println("\uC5B4\uB5A4 \uC815\uC218\uB85C \uBCC0\uD658\uD560\uAE4C\uC694?(2~36");
                cd = stdIn.nextInt();
            } while(cd < 2 || cd > 36);
            int dno = cardConvR(no, cd, cno);
            System.out.println((new StringBuilder(String.valueOf(cd))).append("\uC9C4\uC218\uB85C\uB294 ").toString());
            for(int i = dno - 1; i >= 0; i--)
                System.out.println(cno[i]);

            System.out.println("\uC785\uB2C8\uB2E4.");
            System.out.println("\uD55C \uBC88 \uB354 \uD560\uAC00\uC694?1.yes 2. no");
            retry = stdIn.nextInt();
        } while(retry == 1);
    }
}
