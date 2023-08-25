
package MethodsQuestions;
import java.util.Scanner;
public class Q14 {
    
 //  ör:Kendisine parametre olarak gelen iki stringden büyük olanı geri döndüren metodu yazınız?
    public static void main(String args[]) {
        Scanner k=new Scanner (System.in);
        String a=k.next();
        String b=k.next();
        System.out.println(buyuk(a,b));
    }
    public static String buyuk(String a,String b){
        String enb=" ";
        if (a.length()>b.length()) {
            enb=a;
        }
        else if (a.length()==b.length()) {
            enb="Ikiside esit uzunluktadir";
        }
        else{
            enb=b;}
        return enb;
    }  
  }

