
package Rekürsif_Fonksiyonlar;
public class Tek_Boyutlu_Tamsayi_Dizisindeki_Yüz_Sayinin_Adedini_Bulan_Rekürsif_Fonk {
 //Kendisine parametre olarak gelen tek boyutlu tam sayı dizi içindeki 100 sayısının kaç adet olduğunu bulan ve geri döndüren rekürsif fonk yazınız?
    public static void main(String[] args) {
       int a[]={2,25,100,36,100,35,100,85,45,100,29};
       int x=bul(a,0,0);
        System.out.println(x);
    }
    public static int bul(int a[],int i,int sayac){
        if (i>=a.length) 
            return sayac;
            if (a[i]==100) 
                return bul(a,++i,++sayac);
            
            else 
                return bul(a,++i,sayac);     
    }
}
