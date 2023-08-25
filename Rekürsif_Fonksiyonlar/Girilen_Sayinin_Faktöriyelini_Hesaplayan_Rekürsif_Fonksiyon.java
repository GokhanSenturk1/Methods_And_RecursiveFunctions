
package Rekürsif_Fonksiyonlar;
public class Girilen_Sayinin_Faktöriyelini_Hesaplayan_Rekürsif_Fonksiyon {
  //Kendisine parametre olarak gelen sayının faktöriyelini hesaplayan rekürsif fonk?
    public static int fac(int x){
        if (x==1) {
            return 1;
        }
        else 
            return x*fac(x-1);
                    
    }
    public static void main(String[] args) {
        System.out.println(fac(5));
    }
}
