
package MethodsQuestions;
import java.util.Scanner;

public class Q19 {
  //ör:Kendisine parametre olarak gelen tam sayı dizisindeki en küçük elemanın indisini geri döndüren metodu yazınız?
    public static void main(String[] args) {
        Scanner k=new Scanner (System.in);
        int a[]={5,98,7,2,8};
        int y=enkücük(a);
        System.out.println("En kucuk elemanin indisi = "+y);
        
    }
    public static int enkücük(int x[]){
        int kucuk,indis=0;
        for (int i = 0; i < x.length-1; i++) {
            if (x[i]>x[i+1]) {
                indis=i+1;
            }
        }
        return indis;
    }
   
}
