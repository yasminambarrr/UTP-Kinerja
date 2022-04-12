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
public class MenghitungLuas_OOP {
    int persegi;
    int segitiga; 
    double lingkaran;
    static int menu;
    
    public MenghitungLuas_OOP (int s){
        this.persegi = s * s;
    }
    public MenghitungLuas_OOP (double a, double t){
        this.segitiga = (int) ((a * t)/2);
    }
    public MenghitungLuas_OOP (double jari2){
        if (jari2 % 7 == 0){
            double phi = 22/7;
            int lingkaran = (int) (phi * jari2 * jari2);
            this.lingkaran= (int) lingkaran;
        }else{
            double phi = 3.14;
            double lingkaran2 = phi * jari2 * jari2;
            this.lingkaran= (int) lingkaran2;
        }
    }
    void cetakLuas(){
        if(menu == 1){
            System.out.println(persegi);
        }else if(menu == 2){
            System.out.println(segitiga);
        }else if(menu == 3){
            System.out.println(lingkaran);
        }else{
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        menu = input.nextInt();
        switch (menu){
            case 1:
                int sisi= input.nextInt();
                MenghitungLuas_OOP persegi = new MenghitungLuas_OOP(sisi);
                persegi.cetakLuas();
                break;
            case 2:
                double alas = input.nextInt();
                double tinggi = input.nextInt();
                MenghitungLuas_OOP segitiga = new MenghitungLuas_OOP(alas,tinggi);
                segitiga.cetakLuas();
                break;
            case 3:
                double jarijari = input.nextInt();
                MenghitungLuas_OOP lingkaran = new MenghitungLuas_OOP(jarijari);
                lingkaran.cetakLuas();
                break;
            default:
                System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}

