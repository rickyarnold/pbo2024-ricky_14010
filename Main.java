package com.polimorfisme;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Masukkan Sisi Persegi : ");
        int sisi = inp.nextInt();
        Persegi psg1 = new Persegi(sisi);
        psg1.luas();
        psg1.keliling();
        System.out.println("\n");

        System.out.println("Masukkan jari - jari Lingkaran : ");
        int radius = inp.nextInt();
        Lingkaran lkr1 = new Lingkaran(radius);
        lkr1.luas();
        lkr1.keliling();
        System.out.println("\n");

        System.out.println("Masukkan panjang Persegi Panjang : ");
        int panjang = inp.nextInt();
        System.out.println("Masukkan lebar Persegi Panjang : ");
        int lebar = inp.nextInt();
        PersegiPanjang pp1 = new PersegiPanjang(panjang, lebar);
        pp1.luas();
        pp1.keliling();
        System.out.println("\n"); 
        
        System.out.println("Masukkan Alas Segitiga : ");
        int alas = inp.nextInt();
        System.out.println("Masukkan Tinggi Segitiga : ");
        int tinggi = inp.nextInt();
        Segitiga sgt1 = new Segitiga(alas, tinggi);
        sgt1.luas();
        sgt1.keliling();

        inp.close();
    }
}
