
package MethodsQuestions;
import java.util.Scanner;

public class Q25 {
    //Kendisine parametre olarak gelen stringi büyükleri küçük küçükleri büyüğe çeviren metodu yazınız?
    public static void bharf(String s){
        String bos=" ";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>='a' && s.charAt(i)<='z') {
                bos=bos+(char)(s.charAt(i)-32);//burdaki -32 A ile a arasında 32 tane karekter var.Yani a 97 A 65 dir 32 çıkartarak A ya geliyoruz 
            }
            else if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
                bos=bos+(char)(s.charAt(i)+32);
            }
            else 
                bos=bos+s.charAt(i);
        }
        System.out.println(bos);
    }
    public static void main(String[] args) {
        String s="AsDasaf";
        bharf(s);
    }
}
