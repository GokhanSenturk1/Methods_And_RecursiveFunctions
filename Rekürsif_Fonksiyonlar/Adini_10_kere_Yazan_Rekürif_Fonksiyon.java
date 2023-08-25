
package Rekürsif_Fonksiyonlar;
public class Adini_10_kere_Yazan_Rekürif_Fonksiyon {
 //Ekrana adını 10 defa yazan rekürsif metot?
    public static void main(String[] args) {
       adyazma(10);
    }
    public static void adyazma(int t){
        if (t>0) {
            System.out.println("Gokhan");
            adyazma(--t);
        }
   }
}
