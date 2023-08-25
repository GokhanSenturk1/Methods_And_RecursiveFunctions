
package Rekürsif_Fonksiyonlar;
public class Gelen_Stringi_Ters_Ceviren_Rekürsif_Fonksiyon {
  //Kendisine parametre olarak gelen stringi ters çevirip geri döndüren rekürsüf fonk yazınız?
    public static void main(String[] args) {
       String s="abcde";  
       String str=terscevirme(s,0);
        System.out.println(str);
    }
    public static String terscevirme(String a, int n){ 
        if (n==a.length()) {                            
            return " ";
        }
        else 
            return terscevirme(a,n+1)+a.charAt(n);
    }
}
