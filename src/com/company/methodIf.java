package com.company;

public class methodIf {
    static void checkAge(int z){
        if (z>=18){
            System.out.println("You are free to go");
        }else{
            System.out.println("Get rekt, You are a kid");
        }
    }

    public static void main(String[] args) {
        checkAge(12);
    }
}
