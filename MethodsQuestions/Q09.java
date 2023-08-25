
package MethodsQuestions;
import java.util.Scanner;

public class Q09 {
//   ör:Kendisine parametre olarak gelen stringteki küçük karekterlerin sayısını geri döndüren metodu yazınız?
    public static void main(String[] args) {
        Scanner k=new Scanner (System.in);
        String s=k.next();
        System.out.println(kharfsayisi(s));
    }
    public static int kharfsayisi(String a){
     int sayac=0;                       
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)>='a' && a.charAt(i)<='z') {  
                sayac++;
            }
        }
        return sayac;
    }  
}
