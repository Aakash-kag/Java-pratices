import java.util.*;

public class practise{
    public static void starp(){
        int n=5;
        int counter=1;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
      }
    
    }
    public static void zeroOne(int n){
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if((i+j) % 2 == 0){
              System.out.print("1");
            }else {
              System.out.print("0");
            }
        }
        System.out.println();
      }
    }
    public static void butterFly(int n){
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
          System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++){
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
          System.out.print("*");
        }
        System.out.println();
      }

      for(int i=n;i>=1;i--){
         for(int j=1;j<=i;j++){
          System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++){
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }
   public static void main(String [] args){
      starp();
   }
}