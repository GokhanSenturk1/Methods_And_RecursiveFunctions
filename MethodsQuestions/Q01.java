
package MethodsQuestions;
import java.util.Scanner;

public class Q01 {
    public static void main(String args[]) {
            //ör1:Kendisine parametre olarak gelen 2 tam sayının toplamını geri döndüren metodu yazınız?
        Scanner k=new Scanner(System.in);
        System.out.println("Klavyeden 2 tane deger giriniz");
        int a=k.nextInt();
        int b=k.nextInt();
        System.out.println(topla(a,b));
    }
    public static int topla(int a,int b){
        int top=a+b;
        return top;
    }
   }

