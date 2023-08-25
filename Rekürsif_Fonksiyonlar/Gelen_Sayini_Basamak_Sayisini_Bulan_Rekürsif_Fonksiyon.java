
package Rekürsif_Fonksiyonlar;
import java.util.Scanner;

public class Gelen_Sayini_Basamak_Sayisini_Bulan_Rekürsif_Fonksiyon {
//Kendisine parametre olarak gelen sayının kaç basamaklı olduğunu hesaplayan rekürsif fonk yazınız?
    public static void main(String[] args) {
        Scanner k=new Scanner (System.in);
        System.out.println("Deger giriniz");
        int a=k.nextInt();
        System.out.println(basamak(a));
    }
    public static int basamak(int a){
        if (a==0) {
            return 0;
        }
        else 
            return 1+basamak(a/10);
    }
}
