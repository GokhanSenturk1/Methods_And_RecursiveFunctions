
package MethodsQuestions;
public class Q30 {
   //ör30:Kendisine paremetre olarak gelen 3*3 lük iki boyutlu A ve B matrislerinin toplamını geri döndüren metodu yazınız?
    public static void main(String[] args) {
        int a[][]={{2,3,6},{52,24,12},{28,96,74}};
        int b[][]={{5,8,75},{21,30,26},{86,57,45}};
        int c[][]=new int [3][3];
        c=toplam(a,b);
        int top=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                top=top+c[i][j];
            }
        }
        System.out.println(top);
    }
    public static int[][] toplam(int a[][],int b[][]){
        int top[][]=new int [3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                top[i][j]=a[i][j]+b[i][j];
            }
        }
        return top;
    }
}
