package MethodsQuestions;
public class Q23 {
    //ör:Kendisine parametre olarak gelen tam sayı dizisindeki en büyük ikinci elemanı sayıyı geri döndüren metodu yazınız?
    public static void main(String[] args) {
       int a[]={25,23,36,44,45,78,14};
       int x=enbiki(a);
        System.out.println("Dizideki en buyuk ikinci sayi = "+x+" dir");
    }
    public static int enbiki(int a[]){
        int enb1=a[0];
        int enb2=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>enb1) {
                enb2=enb1; 
                enb1=a[i]; 
            }
        }
        return enb2;
    }
}
