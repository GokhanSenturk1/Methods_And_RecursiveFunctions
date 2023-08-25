
package Rekürsif_Fonksiyonlar;
public class Stringdeki_Kucuk_Karekterlerin_Sayisini_Bulan_Rekürsif_Fonksiyon {
   //Kendisine parametre olarak gelen stringdeki küçük karekterlerim sayısını geri döndüren rekürsif fonk yazınız?
    public static void main(String[] args) {
       int x=kucukharf("AbCcdEf",0,0); 
       System.out.println(x);           
    }
    public static int kucukharf(String a,int n,int ind){
        if (ind==a.length()) {
            return 0;
        }
        else if (a.charAt(ind)>='a' && a.charAt(ind)<='z') {
            return 1+kucukharf( a,++ n,++ ind);
        }
            else 
             return kucukharf(a, n, ind);
    }
}
