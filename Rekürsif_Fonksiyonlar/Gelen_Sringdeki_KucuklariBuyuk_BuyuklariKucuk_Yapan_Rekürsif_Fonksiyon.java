
package Rekürsif_Fonksiyonlar;
public class Gelen_Sringdeki_KucuklariBuyuk_BuyuklariKucuk_Yapan_Rekürsif_Fonksiyon {
//ör:Kendsine parametre olarak gelen stringdeki küçükleri büyük büyükleri küçük olarak geri döndüren rek fonk yazınız?
   public static void main(String[] args) {
        String x ="abcDEF";
           System.out.println(harf(x,0));
    }
       public static String harf(String a,int sayac){
           if (sayac==a.length()) {
               return " ";
               
           }
           else if (a.charAt(sayac)>='A' && a.charAt(sayac)<='Z') {
               return (char)(a.charAt(sayac)+32)+harf(a,++sayac);
                       
           }
           else if (a.charAt(sayac)>='a' && a.charAt(sayac)<='z') {
               return (char)(a.charAt(sayac)-32)+harf(a,++sayac);
           }
           else
               return harf(a,++sayac);
       }
}
