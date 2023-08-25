
package MethodsQuestions;

public class Q37 {

    //ÖR:Kendisine parametre olarak gelen tam sayı dizisindeki en büyük ve en küçük elemanı geri döndüren ana programı ve metodu yazınız?
    public static void main(String[] args) {
        int []a = {5,6,9,8,7,12,56,98,325,65};
        int []y=new int [2];
        y= enbenk(a);  
        System.out.println(y[0]+" "+ y[1]);
  }
    public static int [] enbenk (int [] a){
        int enk=a[0];
        int enb=a [0];
        int [] list=new int [2];
        for (int i = 0; i < a.length; i++) {
            if (enk>a[i])   
              enk=a[i];
            if (enb<a[i]) 
                enb=a[i];
        }
           list[0]=enk;
           list[1]=enb;
           return list;
          
    }
}

