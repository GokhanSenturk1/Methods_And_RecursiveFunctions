package MethodsQuestions;
public class Q28 {
    //Soru 26 daki herbir satırın toplamını geri döndüren metodu yazınız?
    public static void main(String[] args) {
        int x[][]={{2,36},{56,35},{36,56}};
        System.out.println(satirtoplam(x)[0]+" "+satirtoplam(x)[1]+" "+satirtoplam(x)[2]);
    }
    public static int []satirtoplam(int a[][]){
        int satirt[]=new int[3]; 
        for (int i = 0; i < a.length; i++) {
            int stop=0;
            for (int j = 0; j < a[i].length; j++) {
                stop+=a[i][j];
            }
         satirt[i]=stop;
        }
        return satirt;
    }
}
