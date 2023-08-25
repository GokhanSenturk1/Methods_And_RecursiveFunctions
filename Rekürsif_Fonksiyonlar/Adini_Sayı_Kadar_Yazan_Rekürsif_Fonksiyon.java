
package Rekürsif_Fonksiyonlar;
import java.util.Scanner;
public class Adini_Sayı_Kadar_Yazan_Rekürsif_Fonksiyon {
 //Kendisine parametre olarak gelen sayı kadar ekrana adını yazan rekürsif metot?
    public static void main(String[] args) {
        Scanner k=new Scanner (System.in);
        System.out.println("Lutfen deger giriniz");
        int a=k.nextInt();
        adyazma(a);
    }
    public static void adyazma(int i){
        if (i>0) {
            System.out.println("Gokhan");
            adyazma(--i);
        }
    }
}
