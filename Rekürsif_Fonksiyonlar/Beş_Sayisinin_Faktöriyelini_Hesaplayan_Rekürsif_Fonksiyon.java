
package Rekürsif_Fonksiyonlar;
public class Beş_Sayisinin_Faktöriyelini_Hesaplayan_Rekürsif_Fonksiyon {
      //5! hesaplayan rekürsif fonkisyon?
    public static void main(String[] args) {
        int x=factor(5);
        System.out.println(x);
    }
    public static int factor(int n){
        if (n==0)  
          return 1;
        else 
          return n*factor(n-1);
    }
}
