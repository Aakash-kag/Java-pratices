import java.util.*;

public class java2{
    // public static void binToDec(int binNum){
    //     int myNum = binNum;
    //     int pow = 0;
    //     int decNum = 0;

    //     while(binNum > 0){
    //         int lastDigit = binNum % 10;
    //         decNum = decNum + (lastDigit * (int)Math.pow(2,pow));

    //         pow++;
    //         binNum = binNum/10;
    //     }

    //     System.out.println("decimal of " + myNum+" = "+decNum);
    // }
    // public static void decToBin(int n){
    //     int myNum = n;
    //     int pow = 0;
    //     int binNum = 0;
        

    //     while(n>0){
    //         int rem = n%2;
    //         binNum = binNum + (rem * (int)Math.pow(10,pow));

    //         pow++;
    //         n = n/2;
    //     }

    //     System.out.println("binary form of "+ myNum + " = "+ binNum);
    // }
    public static void main(String [] args){
    //    decToBin(7);
    for(int i=1;i<=4;i++){
			for(int j=1;j<=5;j++){
				if(j!=2 && j!=3 && j!=4){
			  	 	System.out.print("* ");
				}else if(i==1 || i==4){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
		System.out.println();
		}
    }
}