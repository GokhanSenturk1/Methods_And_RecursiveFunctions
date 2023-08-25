
package Rekürsif_Fonksiyonlar;
public class Girilen_Sayilarin_Üssünü_Hesaplayan_Rekürsif_Fonksiyon {
     //Kendisine parametre olarak gelen a ve b sayısının a üssü b yi hesaplayan rekürsif fonk?
    public static void main(String[] args) {
        System.out.println(us(2,4));
    }
    public static int us(int a,int b){
        if (b==0) {
            return 1;
        }
        else
            return a*us(a,b-1);
    }
}
