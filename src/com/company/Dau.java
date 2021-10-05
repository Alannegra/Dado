package com.company;

public class Dau {

    int caras = 6;
    int dau1;
    int dau2;
    //int tirades;
    //int[] freq = new int[12];



    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }


    public void metodoTirar(int n) {

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
