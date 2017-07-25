package com.voidalex.MyLinearRegression;

import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException{
        String path = "test.txt";
        MyLinearRegression linearRegression = new MyLinearRegression(path);
        linearRegression.getAB();
        linearRegression.getR2();
        System.out.println("alpha = " + linearRegression.getAlpha());
        System.out.println("beta = " + linearRegression.getBeta());
        System.out.println("R2 = " + linearRegression.getR());
    }
}
