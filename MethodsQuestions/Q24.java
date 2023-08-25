
package MethodsQuestions;
public class Q24 {
    //ör:Kendisine parametre olarak gelen tam sayı dizisindeki en büyük ve en küçük elemanı geri döndüren metodu yazınız?
    public static void main(String[] args) {
      int x []={2,25,-9,985,78,12,24};
      int b[]=new int [2];
      b=eleman(x);
      System.out.println("En buyuk = "+b[0]);
      System.out.println("En kucuk = "+b[1]);
    }
    public static int [] eleman(int a[]){
        int eb,ek;
        eb=a[0];
        ek=a[0];
        for (int i = 0; i <a.length; i++) {
            if (eb<a[i]) {
                eb=a[i];
            }
            else if(a[i]<ek){
                ek=a[i];
            }
            else{
                
            }
        }
        int s[]={eb,ek};
        return s;
    }
}
