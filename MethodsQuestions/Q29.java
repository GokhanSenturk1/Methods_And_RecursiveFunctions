
package MethodsQuestions;
public class Q29 {
    //Kendisine parametre olarak gelen iki boyutlu string dizisindeki en uzun stringi geri döndüren metodu yazınız?
    public static void main(String[] args) {
        String [][]dizi={{"Ahmet","Mehmet","Hasan"},{"Gokhan","Koray","Mustafa"},{"Yusuf","Serhat","Arif"}};
        System.out.println("En uzun string "+ enuzun(dizi)+" dir");
   }
    public static String  enuzun(String[][]a){
        int uzun=a[0][0].length(); 
        String euzun=" ";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (uzun<a[i][j].length()) {
                    uzun=a[i][j].length(); 
                    euzun=a[i][j];
                }
            }
        }
        return euzun;
    }
}
