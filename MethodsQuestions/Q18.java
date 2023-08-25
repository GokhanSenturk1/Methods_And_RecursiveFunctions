
package MethodsQuestions;

public class Q18 {
    //ör:Kendisine parametre olarak gelen tam sayı dizisinin toplamını geri döndüren metodu yazınız?
    public static void main(String[] args) {
      int a []={23,26,12,85};
      int y=toplam(a); 
        System.out.println("Dizinin toplamıi = "+y+" dir");
    }
    public static int toplam(int a[]){
    int top=0;
        for (int i = 0; i < a.length; i++) {
            top=top+a[i];
        }
    return top;
   }
  
}
