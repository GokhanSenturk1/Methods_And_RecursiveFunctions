
package MethodsQuestions;

public class Q21 {
    //ör:Kendisine parametre olarak gelen tam sayı dizisinin her elemanını 1 arttırıp geri döndüren metodu yazınız?
    public static void main(String[] args) {
        int a[]={2,25,87,45,12,15};
        a=arttir(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" "); 
        }
    }
    public static int [] arttir(int a[]){
        for (int i = 0; i < a.length; i++) {
            a[i]++;
        }
        return a;
    }
}
