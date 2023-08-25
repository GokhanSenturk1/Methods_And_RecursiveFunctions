
package MethodsQuestions;
public class Q20 {
    //ör:Kendisine parametre olarak gelen tam sayı dizisinin sıralı olup olmadığını geri döndüren metodu yazınız?
    //sıralama denince küçükten büyüğe sıralamaya bak
    public static void main(String[] args) {
        int a[]={2,5,6,8,9};
        String x=" ";
        x=sıralımı(a);
        System.out.println(x);
        
    }
    public static String sıralımı(int a[]){
        String s=" ";
        for (int i = 0; i <a.length-1; i++) {
            if (a[i]<a[i+1]) {
                s="Gelen dizi siralidir";
            }
            else
                s="Gelen dizi sirali degildir";
        }
        return s;
    }
}
