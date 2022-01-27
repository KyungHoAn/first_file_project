// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   PhysicalExamination.java

package study01.exam02;

import java.io.PrintStream;
import java.util.Scanner;

public class PhysicalExamination
{
    static class PhyscData
    {

        String name;
        int height;
        double vision;

        PhyscData(String name, int height, double vision)
        {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }


    public PhysicalExamination()
    {
    }

    static double aveHeight(PhyscData dat[])
    {
        double sum = 0.0D;
        for(int i = 0; i < dat.length; i++)
            sum += dat[i].height;

        return sum / (double)dat.length;
    }

    static void distVision(PhyscData dat[], int dist[])
    {
        int i = 0;
        dist[i] = 0;
        for(i = 0; i < dat.length; i++)
            if(dat[i].vision >= 0.0D && dat[i].vision <= 2.1000000000000001D)
                dist[(int)(dat[i].vision * 10D)]++;

    }

    public static void main(String args[])
    {
        Scanner stdIn = new Scanner(System.in);
        PhyscData x[] = {
            new PhyscData("a", 162, 0.10000000000000001D), new PhyscData("b", 112, 0.29999999999999999D), new PhyscData("c", 122, 0.29999999999999999D), new PhyscData("d", 132, 0.40000000000000002D), new PhyscData("e", 142, 0.5D), new PhyscData("f", 152, 0.59999999999999998D), new PhyscData("g", 172, 0.69999999999999996D), new PhyscData("h", 182, 0.80000000000000004D), new PhyscData("i", 192, 0.90000000000000002D)
        };
        int vdist[] = new int[21];
        System.out.println("\uC2E0\uCCB4\uAC80\uC0AC \uB9AC\uC2A4\uD2B8");
        System.out.println("\uC774\uB984      \uD0A4   \uC2DC\uB825");
        System.out.println("---------------");
        for(int i = 0; i < x.length; i++)
            System.out.printf("%-8s%3d%5.1f\n", new Object[] {
                x[i].name, Integer.valueOf(x[i].height), Double.valueOf(x[i].vision)
            });

        System.out.printf("\n\uD3C9\uADE0 \uD0A4 %5.1fcm\n", new Object[] {
            Double.valueOf(aveHeight(x))
        });
        distVision(x, vdist);
        System.out.println("\n\uC2DC\uB825 \uBD84\uD3EC");
        for(int i = 0; i < 21; i++)
            System.out.printf("%3.1f~:%2d\uBA85\n", new Object[] {
                Double.valueOf((double)i / 10D), Integer.valueOf(vdist[i])
            });

    }

    static final int VMAX = 21;
}
