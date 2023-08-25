
package MethodsQuestions;
public class Q32 {
    //10 elemanlı 2 tam sayı dizisinin toplamını geri döndüren metod?
    public static void main(String[] args) {
        int a[]={2,3,35,45,15,69,68,57,54,85};
        int b[]={12,26,74,49,68,25,5,4,14,61};
        System.out.println(toplam(a,b));
      
    }
    public static int toplam(int a[],int b[]){
        int top=0;
        for (int i = 0; i < a.length; i++) {
            top=top+a[i]+b[i];
        }                     
        return top;
    }
}
