package com.polimorfisme;

public class Segitiga extends BangunDatar{
    private int alas;
    private int tinggi;

    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void luas(){
        System.out.println("Luas Segitiga : " + 
        (alas * tinggi/2));
    }

    public void keliling(){
        System.out.println("Keliling Segitiga : "+ 
        (3 * alas));
    }
    
    public int getAlas(){
        return alas;
    }
    public int getTinggi(){
        return tinggi;
    }
    
}
