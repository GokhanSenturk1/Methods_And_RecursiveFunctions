
package MethodsQuestions;
import java.util.Scanner;
public class Q15 {
//        ör:Kendisine parametre olarak gelen stringdeki kelime sayısını geri döndüren metod?
    public static int kelimesayisi(String a){
        int sayac=1;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)==' ') { 
                sayac++;
            }
        }
        return sayac;
    }
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        String s=k.nextLine();  
        int m=kelimesayisi(s);
        System.out.println(m);
  }
 }

