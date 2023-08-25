
package MethodsQuestions;
public class Q40 {
   //ör:Kendisine parametre olarak gelen tam sayı dizisinin toplamını geri döndüren metodu yazınız?
    public static void main(String[] args) {
        int x []={1,7,3,6,5,2};
        int y=toplam(x);
        System.out.println(y);
        
    }
    public static int toplam (int []a){
        int top=0;
            for (int i = 0; i < a.length; i++) {
              top=top+a[i];  
      }
       return top;  
       
       
    }
}