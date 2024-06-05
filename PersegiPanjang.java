package com.polimorfisme;

public class PersegiPanjang extends BangunDatar{
    private int panjang;
    private int lebar;

    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void luas(){
        System.out.println("Luas dari persegi panjang : " + (panjang*lebar));;
    }

    public void keliling(){
        System.out.println("Keliling dari persegi panjang : "+ 
        ((2 * panjang) + (2 * lebar)));
    }

    

}