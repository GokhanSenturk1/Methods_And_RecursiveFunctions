
package MethodsQuestions;
public class Q36 {
   //ör:Kendisine parametre olarak gelen 2 boyutlu stringin satırlarını birleştirip geri döndüren methot ve metodu yazınız?
      
      public static void main(String[] args) {
      String []y=new String [2];
      String [][] str={{"ali","veli"},{"abc","de"}};
      y=satirtop(str);
          System.out.println(y[0]+" "+y[1]);
    }
      public static String [] satirtop(String s1 [][]){
        String [] s2=new String [2];
          for (int i = 0; i <s1.length; i++) { 
              for (int j = 0; j <s1[i].length; j++) {   
                  s2[i]=" ";
                  s2[i]+=s1[i][j];
              } }
          return s2;
      }}
