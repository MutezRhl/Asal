
package asal;

import java.util.Scanner;

public class Asal {

   
    public static void main(String[] args) {
       
        Scanner k=new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz");
        int x=k.nextInt();
        System.out.println("Ikinici sayiyi giriniz");
        int y=k.nextInt();
        int sayac=0;
       if(x==y){
           for(int i=2;i<x;i++){
               if(x%i==0){
                   System.out.println("asal degil");sayac++;
           }
           
       }
       if(sayac==0){
           System.out.println("asal");
           }
       }
        if(x>0 && x<y){
          for(int i=x;i<y;i++){  
          if(i==2 || i==3 || i==5 || i==7){
              System.out.println(i);
          }
          else if(i%2==0 || i%3==0 || i%5==0 || i%7==0){
              
          }
          else System.out.println(i);
          }
        }
        if(y>0 && y<x){
             for(int i=y;i<x;i++){
                if(i==2 || i==3 || i==5 || i==7){
                    System.out.println(i);
                }else if(i%2==0 || i%3==0 || i%5==0 || i%7==0 ){
                    
                }else System.out.println(i);
            }
        } 
           
    }
    
}
