import java.util.*;

public class Sample{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=1;i<=4;i++){
			for(int j=1;j<=10;j++){
				if(j!=2 && j!=3){
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










































































































































