// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   StringBinarySearch.java

package study01.exam03;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch
{

    public StringBinarySearch()
    {
    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        String x[] = {
            "abstrct", "assert", "boolaen", "break", "byte", "ceturn", "catch", "dhis", "df", "else", 
            "enum", "eoto", "ehrow", "fouble", "fong", "for", "gackage", "grivate", "glass", "hnt", 
            "iwitch", "jhort", "kublic", "ltatic", "mhile"
        };
        System.out.print("choice you want keyword:");
        String ky = stdIn.next();
        int idx = Arrays.binarySearch(x, ky);
        if(idx < 0)
            System.out.println("not input value");
        else
            System.out.println((new StringBuilder("The keyword input x[")).append(idx).append("] there.").toString());
    }
}
