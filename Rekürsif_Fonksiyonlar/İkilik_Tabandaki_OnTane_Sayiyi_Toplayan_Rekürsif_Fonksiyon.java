
package Rekürsif_Fonksiyonlar;
public class İkilik_Tabandaki_OnTane_Sayiyi_Toplayan_Rekürsif_Fonksiyon {
    //Aşagıdaki 2 lik tabandaki 10 tane  sayıyı toplayan rekürsif fonk yazınız?
    //a={0,1,1,0,1,1....};
    //b={1,1,0,0,1,0....}; 
    public static int [] toplam (int []a,int []b,int []top,int n,int elde){
        if (n!=-1) {
           top[n+1]=a[n]+b[n]+elde;
        
           if (top[n+1]>=2) {
            top[n+1]=top[n+1]-2;
            elde=1; 
           }
            else {
               elde=0;}
         
        return toplam(a,b,top,n-1,elde);
        }
        else{
            top[0]=elde;
        }
        return top;
    }
    public static void main(String[] args) {
        int a[]={1,0,1,0};
        int b[]={1,1,1,0};
        int top[]={0,0,0,0,0};
        top=toplam(a,b,top,3,0);  
        for (int i = 0; i <=4; i++) {
            System.out.println(top[i]);
        }
 }
}
