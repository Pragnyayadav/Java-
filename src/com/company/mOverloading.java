package com.company;

public class mOverloading {
    static int myInt(int x, int y){
        return x + y;
    }
    static double myDouble(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println("int " + myInt(12,14));
        System.out.println("double " + myDouble(12.5,13.5));
    }
}
