package com.company;

public class Prime {
    public static void main(String[] args){
        int i=2,till=10;
        int a = 3;
        for (i=0;i<=till;i++){
            for (int j=2;j<=till/2;j++){
                if (i%j==0){
                    a = 1;
                }
            }
            if (a!=1) {
                System.out.println(i + " ");
            }else if(a==0){
                continue;
            }
        }
    }
}
