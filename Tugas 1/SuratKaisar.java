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
public class SuratKaisar {
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String kata ="";
        String katadepan = input.nextLine();
        int N = input.nextInt();
        System.out.println(isiteks(kata,N,katadepan));
  }
        public static String isiteks (String kata, int N, String katadepan){
        kata = "";
        char alphabet;
        for(int i=0; i < katadepan.length();i++){
            alphabet = katadepan.charAt(i);
                if(alphabet >= 'a' && alphabet <= 'z'){
                alphabet = (char) (alphabet + N);
                    if(alphabet > 'z') {
                    alphabet = (char) (alphabet+'a'-'z'-1);
                    }
                kata = kata + alphabet;
                }
                else if(alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + N);    
                    if(alphabet > 'Z') {
                    alphabet = (char) (alphabet+'A'-'Z'-1);
                    }
                    kata = kata + alphabet;
                    }else {
             kata = kata + alphabet;   
            }  
    }   
        return kata;
        }     
     
     }
