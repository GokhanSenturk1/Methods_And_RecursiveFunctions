
package MethodsQuestions;

public class Q27 {
     //Soru 26 daki en büyük elemanın indisini geri döndüren metod?
    public static void main(String[] args) {
        int x[][]={{2,36},{56,35},{36,256}};
        int a[]=new int [2];
        a=eindis(x);
        System.out.println("En buyuk sayinin indisi = "+a[0]+","+a[1]+" dir");
    }
    public static int [] eindis(int a[][]){
        int enb=a[0][0];
        int indis []=new int [2];
        int satir=0,sutun=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (enb<a[i][j]) {
                    enb=a[i][j];
                    indis[0]=i;
                    indis[1]=j;       
 }} }
        return indis;
  }
}
