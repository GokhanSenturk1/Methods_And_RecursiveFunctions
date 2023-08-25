
package Rekürsif_Fonksiyonlar;
public class On_Elemanli_TamSayiDizisindeki_Pozitif_Sayilarin_Adedini_Bulan_Rekürsif_Fonksiyon {

//Kendisine parametre olarak gelen 10 elemanlı tam sayı dizisindeki pozitif sayıların adedini geri döndüren rekürsif fonk yazınız?
    public static void main(String[] args) {
        int x []={25,63,65,3,2,7,-9,0,12,5};
        int s=pozitif(x,0);
        System.out.println(s);
        
    }
    public static int pozitif(int a[],int n){ 
        if (n==a.length) {
            return 0;
        }
        else if (a[n]>0) {
            return 1+pozitif(a,++n);
        }
        else 
            return pozitif(a,++n);
    }
}
