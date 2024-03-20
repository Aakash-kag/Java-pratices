import java.io.*;

class Addition{
    public static void main (String args[]){
        int a,b,c;
        try{
            InputStreamReader isr = new InputStreamReader(System.in);

            BufferedReader br = new BufferedReader(isr);

            System.out.println("Please enter 1st value");
            a = Integer.parseInt(br.readLine());

            System.out.println("please enter 2nd value");
            b = Integer.parseInt(br.readLine());

            c=a+b;

            System.out.print("substraction = "+ c);
        }catch (Exception error)
        
        {
            System.out.println(" "+error);
        }
    }
}