
package MethodsQuestions;
public class Q35 {
    //Kendisine parametre olarak gelen tam sayı dizisinin toplamını geri döndüren metodu yazınız?
     public static int toplam(int a[]){
         int top=0;
         for (int i = 0; i < a.length; i++) {
             top=top+a[i];
         }
         return top;   
     }
     public static void main(String[] args) {
        int x[]={25,65,89,76,52};
        int y=toplam(x);
         System.out.println(y);
    }
}
