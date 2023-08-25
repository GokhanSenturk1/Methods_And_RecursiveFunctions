
package MethodsQuestions;

public class Q39 {
 public static void main(String[] args) {
        //ör:Kendisine parametre olarak gelen stringi büyük harflere çeviren metodu yazınız?
        String  s="aliVe?E";
        String str=buyuk(s);   
        System.out.println(str);
       
    }
    public static String buyuk (String s1){
        String bos=" ";
        for (int i = 0; i < s1.length(); i++) 
            if (s1.charAt(i)>='a' && s1.charAt(i)<='z') 
                bos+=(char)(s1.charAt(i)-32); 
            else 
                bos+=s1.charAt(i);
                return bos;
        }
    
}
