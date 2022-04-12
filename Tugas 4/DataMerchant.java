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
public class DataMerchant {
    static Merchant[] merchant = new Merchant[0];

    public static Merchant[] tambahMerchant (Merchant m){
        Merchant[] merch = new Merchant[DataMerchant.merchant.length + 1];

        for (int i = 0; i < DataMerchant.merchant.length; i++){
            merch[i] = merchant[i];
        }

        merch[DataMerchant.merchant.length] = m;
        return merch;
    }

    public static void tampilData(){
        for (Merchant x : DataMerchant.merchant) {
            System.out.println("=== Tampilan Data Merchant UBFOOD ===");
            System.out.println("Nama Merchant   : " + x.getNamaMerchant());
            System.out.println("Nama Produk     : " + x.getNamaProduk());
            System.out.println("Harga           : " + (int) x.getHargaMakanan());
        }
    }

    public static Merchant cariMerchant (String nama){
        int index = 0;
        for (int i = 0; i < DataMerchant.merchant.length; i++){
            if (DataMerchant.merchant[i].getNamaMerchant() == nama){
                index = i;
                break;
            }
        }
        return merchant[index];
    }

    public static void tampilMerchant (Merchant m){
        System.out.println("=== Tampilan Data Merchant UBFOOD ===");
        System.out.println("Nama Merchant   : " + m.getNamaMerchant());
        System.out.println("Nama Produk     : " + m.getNamaProduk());
        System.out.println("Harga           : " + (int) m.getHargaMakanan());
    }

    public static void updateMerchant (Merchant m, String nm, String np, double h){
        Scanner input = new Scanner(System.in);
        m.setNamaMerchant(nm);
        nm = input.nextLine();
        m.setNamaProduk(np);
        m.setHargaMakanan(h);
    }
}

