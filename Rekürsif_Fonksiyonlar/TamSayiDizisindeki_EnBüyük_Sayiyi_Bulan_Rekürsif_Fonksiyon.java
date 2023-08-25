
package Rekürsif_Fonksiyonlar;
public class TamSayiDizisindeki_EnBüyük_Sayiyi_Bulan_Rekürsif_Fonksiyon {
    
 //Kendisine parametre olarak gelen  bir tam sayı dizisindeki en büyük elemanı bulan rekürsif fonk yapınız?
    public static void main(String[] args) {
        int a[]={2,25,45,87,59,26,32,987,36,34};
        System.out.println(enbuyuk(a,0,a[0]));
    }
    public static int enbuyuk(int a[],int sayac,int buyuk){
        if (sayac==a.length)
            return buyuk;
          
        else if (buyuk<a[sayac]) {
            buyuk=a[sayac];
            return enbuyuk(a,++sayac,buyuk);
        }
        else 
            return enbuyuk(a,++sayac,buyuk);
                 
    }
}


