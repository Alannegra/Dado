package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        int caras = 6;
        int dau1;
        int dau2;

        int n = scanner.nextInt();


            int[] array = new int[caras*2+3];

            for (int i = 0; i < n; i++) {
                dau1 = (int)(Math.random()*6+1);
                dau2= (int)(Math.random()*6+1);
                array[dau1+dau2] ++;
            }
            for (int i = 2; i < array.length-2; i++) {
                System.out.println(i+ "-----> "+ array[i]);
            }




    }
}
