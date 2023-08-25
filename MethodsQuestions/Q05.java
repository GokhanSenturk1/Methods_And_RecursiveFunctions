
package MethodsQuestions;
import java.util.Scanner;
public class Q05 {
    
        //ör: n. fibonacci sayısını geri döndüren metodu yazınız?
    public static void main(String[] args) {
       Scanner k=new Scanner (System.in); 
       int a=k.nextInt();
        System.out.println(fibonacci(a));
    }
    public static int fibonacci(int n){
     int a,b,sonuc=0;  
     a=1;
     b=1;
     for (int i = 1; i <= n; i++) {
          a=b;
          b=sonuc;
          sonuc=a+b;
        }
        return sonuc;
    }
}
