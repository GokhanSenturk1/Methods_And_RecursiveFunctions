
package MethodsQuestions;

import java.util.Scanner;
public class Q38 {

   public class AlgoDersMetot5 {
    //ör:Kendisine parametre olarak gelen dizin elamanlarını bir artırıp geri döndüren ana program ve metodu yazınız?
    public static void main(String[] args) {
        Scanner k=new Scanner (System.in);
         int x []={1,1,1,1,1,1,1,1,1,1}; 
         int [] y=new int [10];
         x=artir(x);
         for (int i = 0; i <y.length; i++) {
             System.out.println(x[i]);
        }
    }
    public static int [] artir (int [] a){
        for (int i = 0; i < a.length; i++) {
            a[i]++;
        }
        return a;
        
    }
}
}
