
package MethodsQuestions;

public class Q34 {
    //Kendisine parametre olarak gelen 10 elemanlı sayı dizisindeki tek olanların ortalamasını geri döndüren metodu yazınız?
    public static void main(String[] args) {
        int a[]={2,36,54,78,45,25,2,3,5,7};
        System.out.println(tekort(a));
    }
    public static double tekort(int a[]){
        double ort=0,top=0,sayac=1;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==1) {
                top=top+a[i];
                sayac++;
            }
            ort=top/sayac;
        }
        return ort;
    }
}
