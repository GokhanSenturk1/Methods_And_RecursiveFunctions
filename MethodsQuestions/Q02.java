
package MethodsQuestions;
public class Q02 {

  // ör2:Kendisine parametre olarak gelen iki sayının a üssü b sini hesaplayıp geri döndüren metodu yazınız?
    public static void main(String[] args) {
        System.out.println(ushesapla(3,4));
    }
    public static double ushesapla(int a,int b){
        double deger=1;
        for (int i = 1; i <= b; i++) {
            deger=deger*a;
        }
        return deger;
    }
}
