
package MethodsQuestions;

import java.util.Scanner;

public class Q13 {

      //ör:Kendisine parametre olarak gelen stringdeki aa stringlerinden kaç tane olduğunu geri döndüren metodu yazınız?
    public static void main(String[] args) {
        Scanner k=new Scanner (System.in);
        String a=k.next();
        System.out.println(aabul(a));
    }
    public static int aabul(String a){
        int sayac=0;
        for (int i = 0; i < a.length()-1; i++) {
            if (a.charAt(i)=='a' && a.charAt(i+1)=='a') {
             sayac++;   
            }
        }
        return sayac;
    }
}
