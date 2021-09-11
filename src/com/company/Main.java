package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Till where do you want Fibonacci: ");

        int input = inp.nextInt();

        int n1=0,n2=1,n3=0,i;

        System.out.println(n1 + " " + n2);
        for (i=0;i<input;i++){
            n3=n2+n1;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }

    }
}