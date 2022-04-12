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
public class SaldoNasabah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double tabungan = input.nextInt();
        double setoran = input.nextInt();
        double totalmasuk = tabungan + setoran;
        double saldoakhir = administrasi (totalmasuk);
        System.out.println(saldoakhir);
    }
    
   public static double administrasi(double total2) {
        double totalkurang = total2-7000;
        double bonus = totalkurang + (5 * totalkurang/10000);
        return bonus;
    }
    
    static void pengurangan() {
        
  
    }
    
    
}
