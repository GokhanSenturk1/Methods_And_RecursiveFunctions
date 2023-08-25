
package Rekürsif_Fonksiyonlar;
public class TekBoyutlu_Sayisal_Dizideki_Bes_Sayisini_Bulan_Rekürsif_Fonksiyon {
    //ör:Kendisine parametre olarak gelen tek boyutlu sayısal dizi içinde 5 sayısının olup olmadığını bulan rekürsif fonk?
    public static void main(String[] args) {
      int a[]={5,25,63,5,23,51,68};
      int adet=sayibul(a,0,0);
        System.out.println(adet);
    }
    public static int sayibul(int a[],int sayac,int i){
        if (i>=a.length)  {
            return sayac;
        }
        else if (a[i]==5){  
                return  sayibul(a,++sayac,++i);
        }
        return 0;
    }  
}
  
    

