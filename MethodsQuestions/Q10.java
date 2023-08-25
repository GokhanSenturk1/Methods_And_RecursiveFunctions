
package MethodsQuestions;
import java.util.Scanner;

public class Q10 {

      //ör10:Kendisine parametre olarak gelen stringi ters çevirip geri döndüren metodu yazınız?
    public static void main(String[] args) {
        Scanner k=new Scanner (System.in);
        String a=k.next();
        System.out.println(terscevirme(a));
    }
    public static String terscevirme(String b){
        String bos=" ";
        for (int i = b.length()-1; i >=0; i--) {
            bos=bos+b.charAt(i);
        }
        return bos;
    }
}
