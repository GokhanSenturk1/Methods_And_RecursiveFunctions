
package Rekürsif_Fonksiyonlar;
public class TamSayiDizisinin_Sirali_Oldugunu_Bulan_Rekürsif_Fonksiyon {

    //Kendisine parametre olarak gelen tam sayı dizisinin sıralı olup olmadığını geri döndüren rekürsif metod yazınız?
    public static void main(String[] args) {
        int x[]={1,2,3,4,5};
        boolean t=siralimi(x,0);  
        System.out.println(t);      
    }
    public static boolean siralimi (int[]a,int n){
        if (n==a.length-1) { 
            return true;     
        }
        else if (a[n]<a[n+1]) {      
            return siralimi(a,++n);
        }
        else 
            return false;        
        }
}
