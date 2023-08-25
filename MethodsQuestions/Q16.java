
package MethodsQuestions;
import java.util.Scanner;

public class Q16 {
  //ör:Kendisine parametre olarak gelen stringde a karekterlerinin olup olmadığını ve sayısını  geri döndüren metodu yazınız?
    public static void main(String[] args) {
        Scanner k=new Scanner (System.in);
        System.out.println("Klavyeden string giriniz");
        String s=k.next();
        String a[]=new String [2];
        a=geridondurme(s);
        System.out.println(a[0]+" "+a[1]);
        
    }
    public static String[] geridondurme(String b){
        String bos=" ";
        int sayac=0;
        for (int i = 0; i < b.length()-1; i++) {
            if (b.charAt(i)=='a') {   
                bos="Girilen string de A karekteri vardir";
                sayac++;
            }
            else {
                bos="Girilen string de A karekteri yoktur";
            }
        }
         String s=Integer.toString(sayac);
         String a[]=new String[2];
         a[0]="a";
         a[1]="s";
        return a ;
    }
}
