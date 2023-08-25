
package MethodsQuestions;
import java.util.Scanner;

public class Q08 {
        //ör:Kendisine parametre olarak gelen iki tam sayıdan büyük olanını geri döndüren motodu yazınız?
 public static int buyukbul(int a,int b){ 
        int eb;
        if (a>b) {
            eb=a;
        }
        else {
            eb=b;}
        return eb;
    }
    public static void main(String[] args) {
        Scanner k=new Scanner (System.in);
        System.out.println("Klavyeden 2 deger giriniz");    
        int a=k.nextInt();
        int b=k.nextInt();
        System.out.println("Buyuk sayi = "+buyukbul(a,b));
    }
   }

