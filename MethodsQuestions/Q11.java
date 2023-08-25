
package MethodsQuestions;

import java.util.Scanner;

public class Q11 {

//ör:Kendisine parametre olarak gelen stringdeki küçük karekterleri büyük yapan sonucu geri döndüren metodu yazınız?    
    public static void main(String[] args) {
        Scanner k=new Scanner (System.in);
        String s=k.next();
        System.out.println(harf(s));
    }
    public static String harf(String a){
        String bos=" ";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)>='a' && a.charAt(i)<='z') {
                bos+=(char)(a.charAt(i)-32);
            }
        }
        return bos;
    }    
}

