
package MethodsQuestions;
import java.util.Scanner;

public class Q06 {
    //ör:Kendisine parametre olarak gelen pozitif tam sayının faktöriyelini geri döndüren metodu yazınız?
    public static int faktöriyel(int a){
        int sonuc=1;
        for (int i = 1; i <= a; i++) {
            sonuc=sonuc*i; 
        }
    return sonuc;
    }
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int b=k.nextInt();
        System.out.println(faktöriyel(b));
   }
}
