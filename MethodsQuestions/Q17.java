
package MethodsQuestions;
import java.util.Scanner;

public class Q17 {
    //ör:Kendisine parametre olarak gelen stringin polindrome olup olmadığını geri döndüren metodu yazınız?
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        String s=k.next();
        System.out.println(polindrom(s)); 
    }
    public static boolean polindrom (String a){
        boolean kontrol=true; 
        int bas=0;
        int son=a.length()-1;
        while (bas<son){
            if (a.charAt(bas)!=a.charAt(son)) {
                kontrol=false;
                break;
            }
            bas++;
            son--;
        }
       return kontrol;
    }
}
