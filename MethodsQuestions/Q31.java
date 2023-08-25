package MethodsQuestions;
public class Q31 {
   //Kendisine parametre olarak gelen 10 elemanlı tam sayı dizisini 1 sağ döndüren ve diziyi ana metoda geri döndüren metodu yazınız?
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,0};
        for (int i = 0; i < a.length-1; i++) {
            System.out.println(döndurme(a)[i]);
        }
    }
    public static int []döndurme(int x[]){
        int yedek=x[9];
        for (int i = 8; i >=0; i--) {
           x[0]=x[9];
           x[0]=yedek;  
        }
      
        return x;
    }
}
