
package Rekürsif_Fonksiyonlar;
public class Girilen_Pozitif_Sayi_Kadarki_Sayilari_Toplayan_Rekürsif_Fonksiyon {
    //Kendisine parametre olarak gelen pozitif tam sayıya kadar olan sayıların toplamını hesaplayan rekürsif fonk?
    public static void main(String[] args) {
     int b=toplam(4);
        System.out.println(b);
    }
    public static int toplam(int a){
        if (a==1) {
            return 1;   
        }
        else {
            return a+toplam(a-1);
        }
    }
}
