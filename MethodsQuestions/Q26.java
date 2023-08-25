package MethodsQuestions;
import java.util.Scanner;

public class Q26 {
   //ör:Kendisine parametre olarak gelen iki boyutlu tam sayı dizisindeki en büyük sayıyı geri döndüren methodu yazınız?
    public static void main(String[] args) {
        Scanner k=new Scanner (System.in);
        int x[][]=new int [2][2];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.println("Dizinin degerlerini giriniz");
                x[i][j]=k.nextInt();
            }
        }
        int a=enb(x);
        System.out.println("En buyuk sayi = "+a+" dir");
    }
    public static int enb(int a[][]){
        int enb =a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (enb<a[i][j]) {
                    enb=a[i][j];
                }
            }
        }
        return enb;
    }
}
