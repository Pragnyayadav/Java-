package com.company;

public class New {
    public static void main(String[] args) {
        int a=0,i;
        int no1=7;

        for (i=2;i<no1;i++){
            if (no1%i==0) {
                a = 1;
            }
        }
        if (a==1){
            System.out.println("Not Prime");
        }else {
            System.out.println("Prime");
        }

    }
}
