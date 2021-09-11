package com.company;

public class Method2 {
    static void iAm(String name, int age){
        System.out.println(name + " is " + age);
    }



    static int myMeth(int z){
        return 5+z;
    }

    public static void main(String[] args) {
        iAm("Recoir",5);
        System.out.println(myMeth(9));
    }
}
