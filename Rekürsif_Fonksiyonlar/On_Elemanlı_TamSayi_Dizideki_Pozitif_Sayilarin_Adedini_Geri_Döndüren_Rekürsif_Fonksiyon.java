
package Rekürsif_Fonksiyonlar;
public class On_Elemanlı_TamSayi_Dizideki_Pozitif_Sayilarin_Adedini_Geri_Döndüren_Rekürsif_Fonksiyon {
//Kendisine parametre olarak gelen 10 elemanlı tam sayı dizisindeki pozitif sayıların adedini geri döndüren rekürsif fonk yazınız?
    public static void main(String[] args) {
        int a[]={2,-98,65,25,14,-8,0,3,-91,-35};
        int s=pozsay(a,0,0);
        System.out.println(s);
    }
    public static int pozsay(int a[],int n,int sayac){
        if (n==a.length) {          
            return 0;
        }
        else if (a[n]>0) {
            return 1+pozsay(a,++n,++sayac);
        }
        else 
            return pozsay(a,++n,sayac);
    }
}
