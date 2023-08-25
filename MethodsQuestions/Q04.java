
package MethodsQuestions;
import java.util.Scanner;
public class Q04 {
    
   //ör:Kendisine parametre olarak gelen pozitif tam sayının kaç basamaklı olduğunu geri döndüren metodu yazınız?
    public static void main(String[] args) {
        Scanner k=new Scanner (System.in);
        int a,m;
        System.out.println("Lutfen deger giriniz");
        a=k.nextInt();
        m=basamaksay(a);
        System.out.println(m);                
    }
    public static int basamaksay(int sayi){
        int basamak=0;
        while (sayi>0){
            sayi=sayi/10;
            basamak++;
        }
        return basamak;
    }
}