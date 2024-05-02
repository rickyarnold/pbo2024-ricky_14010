package responsi;
import java.util.*;

class Person{
    //atribut dan method super class
    protected String name;
    protected String address;
    protected String hobi;
    public void identity(){
        System.out.println("Nama: " + name);
        System.out.println("Alamat: " + address);
    }
    public void hobi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Apa hobimu? : ");
        hobi = scanner.nextLine();
        System.out.println("Hobi adalah "+ hobi);
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama : ");
        name = scanner.nextLine();
        System.out.println("Masukkan alamat : ");
        address = scanner.nextLine();
    }
}

public class Student extends Person {
    String nim;

    public String getNim(){
        return nim;
    }

    @Override
    public void identity(){
        System.out.println("Jml tagihan " + name + " : " + hitungPembayaran());
        System.out.println("NIM :"  + getNim());
        super.identity();        
    }

    public void input(){
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan NIM : ");
        nim = scanner.nextLine();
    }

    public double hitungPembayaran(){
        double tagihan = 0;
        double spp = 0;
        double sks = 0;
        double modul = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan spp : ");
        spp = scanner.nextDouble();
        System.out.println("Masukkan sks : ");
        sks = scanner.nextDouble();
        System.out.println("Masukkan modul : ");
        modul = scanner.nextDouble();
        
        return tagihan = spp + sks + modul;
    }
}
