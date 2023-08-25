
package MethodsQuestions;

import java.util.Scanner;

public class Q12 {
//        ör:Kendisine parametre olarak gelen stringdeki küçükleri büyük büyükleri küçük yapıp geri döndüren metod?
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        String s=k.next();
        System.out.println(harfcevirme(s));
    }
    public static String harfcevirme(String a){
        String bos="";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)>='a' && a.charAt(i)<='z') {
                bos+=(char)(a.charAt(i)-32);
            }
            else {
                bos+=(char)(a.charAt(i)+32);}
        }
        return bos;
    }
}
