
package MethodsQuestions;
public class Q41 {
   //Kendisine parametre olarak gelen iki boyutlu sayısal dizi içindeki en büyük sayiyi, yerini(satir,sütün) geri döndüren metot?
    public static int[] buyukbul(int a[][]){
    int enbuyuk=a[0][0];
    int satir=0,sutun=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (enbuyuk<a[i][j]) {
                    enbuyuk=a[i][j];
                    satir=i;
                    sutun=j;
                }
            }
        }
        int x[]={enbuyuk,satir,sutun}; 
        return x; 
}
    public static void main(String[] args) {
        int dizi[][]={{2,3,68},{256,36,87},{25,654,251}};
        int buyuk[]=new int [3]; 
        buyuk=buyukbul(dizi);
        System.out.println("En buyuk deger = "+buyuk[0]+" dir ");
        System.out.println("En buyuk degerin yeri "+buyuk[1]+","+buyuk[2]+" dir");
    }
    
}
