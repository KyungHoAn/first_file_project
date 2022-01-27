// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Int2DArray.java

package study01.exam02;

import java.io.PrintStream;

public class Int2DArray
{

    public Int2DArray()
    {
    }

    public static void main(String args[])
    {
        int x[][] = new int[2][4];
        x[0][1] = 37;
        x[0][3] = 54;
        x[1][3] = 65;
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 4; j++)
                System.out.println((new StringBuilder("x[")).append(i).append("][").append(j).append("]=").append(x[i][j]).toString());

        }

    }
}
