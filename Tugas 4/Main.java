/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UB_Company;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        // untuk input data merchant
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 8000));

        System.out.println("Nama    : Yasmin Ambar Athirah Soamole");
        System.out.println("Nim     : 215150601111003");
        DataMerchant.tampilData();
        System.out.println();

       //penambahan data merchant dengan masukan input
        System.out.println("===Memasukkan Data Merchant Melalui Input===");
        System.out.print("Input Nama Merchant : ");
        String nm = input.nextLine();
        System.out.print("Input Nama Produk : ");
        String np = input.nextLine();
        System.out.print("Input Harga Produk : ");
        double h = input.nextDouble();
        input.nextLine();

        DataMerchant.merchant = DataMerchant.tambahMerchant(new Merchant(nm, np, h));
        System.out.println();

        //tampilan data merchant
        System.out.println("===Menampilkan Data Merchant===");
        DataMerchant.tampilData();
        System.out.println();

        //mengubah data merchant
        DataMerchant.updateMerchant(DataMerchant.cariMerchant("Bakso Pak Sahid"), "Bakso Pak Sahid", "Bakso Mercon", 15000);

        //tampilan data merchant yang diupdate
        System.out.println("===Menampilkan Data Merchant yang nilainya sudah di update===");
        DataMerchant.tampilMerchant(DataMerchant.cariMerchant("Bakso Pak Sahid"));

        System.out.println();
        System.out.println("Nama    : Yasmin Ambar Athirah Soamole");
        System.out.println("Nim     : 215150601111003");



    }
}

