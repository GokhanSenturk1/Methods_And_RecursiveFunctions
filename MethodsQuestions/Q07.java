
package MethodsQuestions;
import java.util.Scanner;

public class Q07 {
    public static void main(String args[]) {
  // ör:Kendisine parametre olarak gelen pozitif tam sayıya kadarki tüm sayıları toplayıp geri döndüren metodu yazınız?
        Scanner k=new Scanner (System.in);
        int a=k.nextInt();
        System.out.println(toplam(a));
    }
    public static int toplam(int a){
        int sonuc=0;
        for (int i = 1; i <=a; i++) {
            sonuc=sonuc+i; 
        }
        return sonuc;
    }
    }

