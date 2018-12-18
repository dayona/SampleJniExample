package com.example.sooorajjj.samplejniexample;

public class SquareLib {
    public native static int squareN(int  n);

    public static int to4(int n)
    {
        int sq = squareN(n);
        return sq;
    }

    static {
        System.loadLibrary("com_example_sooorajjj_samplejniexample_SquareLib");
    }
}
