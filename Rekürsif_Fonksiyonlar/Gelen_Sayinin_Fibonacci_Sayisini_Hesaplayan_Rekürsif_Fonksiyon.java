
package Rekürsif_Fonksiyonlar;
public class Gelen_Sayinin_Fibonacci_Sayisini_Hesaplayan_Rekürsif_Fonksiyon {
  //Kendisine parametre olarak gelen n tam sayısına karşılık fibonacci sayısını hesapalayan rekürsif fonk?
    
    public static void main(String[] args) {
        System.out.println(fibonacci(4));   
    }
    public static int fibonacci(int x){
        if (x<=1) {
            return x;
        }
        else 
            return fibonacci(x-1)+fibonacci(x-2);
    }
}
