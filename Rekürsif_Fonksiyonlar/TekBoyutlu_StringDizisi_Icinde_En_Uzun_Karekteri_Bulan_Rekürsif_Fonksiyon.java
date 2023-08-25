
package Rekürsif_Fonksiyonlar;
public class TekBoyutlu_StringDizisi_Icinde_En_Uzun_Karekteri_Bulan_Rekürsif_Fonksiyon {
 //Kendisine parametre olarak gelen tek boyutlu string dizi içinde en uzun karektere sahip stringi bulup ekrana yazan rekürsif metodu bulunuz?
    public static void main(String[] args) {
        String str[]={"Gokhan","Mustafa","Abdurrahman","Mehmet","Zekiye"};
        String a=enuzun(str,0,0," ");
        System.out.println(a);
       
    }
    public static String enuzun(String a[],int i,int uzun,String euzun){
        uzun=a[0].length();
        if (i>=a.length) 
            return euzun;
            if (uzun<a[i].length()) {
                euzun=a[i]; 
                return enuzun(a,++i,uzun,euzun);
            }
            else 
                return enuzun(a,++i,uzun,euzun);
    }
}
