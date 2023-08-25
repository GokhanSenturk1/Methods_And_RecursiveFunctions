
package Rekürsif_Fonksiyonlar;
public class Gelen_Sayini_Kac_Basamak_Sayisini_Bulan_Rekürsif_Fonksiyon_CozumIki {

   //Kendisine parametre olarak gelen sayının kaç basamaklı olduğunu hesaplayan rekürsif fonk yazınız?
    public static void main(String[] args) {
        int x=bass(572);   
        System.out.println(x);
    }
    public static int bass (int a){
        if (a>=-9 && a<=9) 
            return 1;
        else
            return 1+bass(a/10);
        
    }
}
