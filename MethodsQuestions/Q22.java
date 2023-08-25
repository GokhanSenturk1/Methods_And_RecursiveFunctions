
package MethodsQuestions;
public class Q22 {
    //ör:Kendisine paremetre olarak gelen string dizisindeki en uzun stringin olduğu indisi geri döndüren metodu yazınız?
    public static void main(String[] args) {
        String s[]={"gokhan","mustafa","mehmet","zekiye","dsadasd"};
        int a=enuzun(s);
        System.out.println("En uzun stringin indisi = "+a+" dir");
    }
    public static int enuzun(String s[]){
        int indis=0;
        for (int i = 0; i < s.length-1; i++) { 
            if (s[i].length()<s[i+1].length()) {
                indis=i+1; 
            }
        }
        return indis;
    }
}
