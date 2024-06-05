package com.polimorfisme;

public class Lingkaran extends BangunDatar {
    private int radius;
    private static final double PHI = 3.14;

    public Lingkaran(int radius){
        this.radius = radius;
    }

    @Override
    public void luas(){
        System.out.println("Luas Lingkaran: " + (PHI * radius * radius));
    }

    public void keliling(){
        System.out.println("Keliling Lingkaran : " + (2 * PHI * radius));
    }
}
