
package Rekürsif_Fonksiyonlar;
public class TamSayiDizisindeki_EnBüyük_Sayinin_Indisini_Bulan_Rekürsif_Fonksiyon {
   //Kendisine parametre olarak gelen bir tam sayı dizisinde en büyük elemanın indisini hesaplayan rekürsif fonk.
    public static void main(String [] args){
        int a[]={2,25,78,84,695,95,21,3};
        System.out.println(enbuyuk(a,0,0));
    }
    public static int enbuyuk(int a[],int indeks,int sayac){ 
        if (sayac==a.length)                                 
          return indeks;
          else if (a[indeks]<a[sayac]) {
           indeks=sayac;
           return enbuyuk(a,indeks,++sayac);
}
          else 
              return enbuyuk(a,indeks,++sayac);
      
    }
    
}