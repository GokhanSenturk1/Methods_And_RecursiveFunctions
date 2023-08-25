
package MethodsQuestions;
import java.util.Scanner;

public class Q33 {
    //Kendisine parametre olarak gelen tam sayının asal olup olmadığını geri döndüren metod?
    public static void main(String[] args) {
        Scanner k=new Scanner (System.in);
        int a=k.nextInt();
        System.out.println(asalmi(a));
        
    }
    public static String asalmi(int a){
        String t=" ";
        for (int i = 2; i <Math.sqrt(a); i++) { 
            if (a%i==0) {    
                t="Asal degildir";
            }
                else 
                t="Asaldır";
              
            }
        return t;
        }
    
}
