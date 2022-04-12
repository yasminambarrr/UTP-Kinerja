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
public class MenghitungLuas {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    
    int menu = input.nextInt();
        switch (menu){
            case 1 :{
                int sisi = input.nextInt();
                System.out.println(persegi(sisi));
                break;
            }
            
            case 2 :{
            int alas = input.nextInt();
            int tinggi = input.nextInt();
                System.out.println(segitiga(alas,tinggi));
                break;
            }
            
            case 3 :{
            int jarijari = input.nextInt();
                System.out.println(lingkaran(jarijari));
                break;
            }
            
            default:{
                System.out.println("Input yang anda masukan tidak sesuai");
            }
        }
    }
    
    public static int persegi (int s){
        return s * s;
    }
    
    public static int segitiga (int a,int t){
        return (int) ((a * t)/2);      
    }
    
    public static double lingkaran (int jari2){
        if (jari2 % 7 == 0){
            double phi = 22/7;
            double lingkaran = phi * jari2 * jari2;
            return lingkaran;
        }else{
            double phi = 3.14;
            double lingkaran = phi * jari2 * jari2;
            return (int)lingkaran;
        }
    }
}
    
       
