/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author yasmi
 */
public class Erigo {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Baju objek = new Baju();
        objek.halo();

        System.out.print("Baju yang akan anda beli bertipe : ");
        objek.jenis = input.nextLine();

        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        objek.jumlah = input.nextInt();

        objek.disp();

    }
}

class Baju2 {
    String jenis;
    int harga;
    int jumlah;

    final int baju_a = 100000;
    final int baju_b = 125000;
    final int baju_c = 175000;

    void ready() {
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga " + baju_a);
        System.out.println("Baju B dengan harga " + baju_b);
        System.out.println("Baju C dengan harga " + baju_c);
    }

    void harga_bA() {
        if (jumlah > 100) {
            this.harga = 95000;
        } else {
            this.harga = baju_a;
        }
    }

    void harga_bB() {
        if (jumlah > 100) {
            this.harga = 120000;
        } else {
            this.harga = baju_b;
        }
    }

    void harga_bC() {
        if (jumlah > 100) {
            this.harga = 160000;
        } else {
            this.harga = baju_c;
        }
    }

    void disp() {
        if (jenis.equalsIgnoreCase("a"))
            harga_bA();
        else if (jenis.equalsIgnoreCase("b"))
            harga_bB();
        else if (jenis.equalsIgnoreCase("c"))
            harga_bC();

        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total harga          : " + harga * jumlah);
    }
    
}

