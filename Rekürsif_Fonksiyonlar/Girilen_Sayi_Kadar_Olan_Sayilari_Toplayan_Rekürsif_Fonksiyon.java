
package Rekürsif_Fonksiyonlar;
import java.util.Scanner;

public class Girilen_Sayi_Kadar_Olan_Sayilari_Toplayan_Rekürsif_Fonksiyon {
//Kendisine parametre olarak gelen n tamsayısına kadarki sayıların toplamını geri döndüren rekürsif fonk yazınız?
    public static void main(String [] args){
        Scanner k=new Scanner (System.in);
        System.out.println("Klavyeden deger giriniz");
        int a=k.nextInt();
        int b=toplam(a);
        System.out.println(a+". sayiya kadar olan sayilarin toplami = "+b);
    }
    public static int toplam(int a){
        if (a==1) {
            return 1;
        }
        else 
            return a+toplam(a-1);
    }
}
