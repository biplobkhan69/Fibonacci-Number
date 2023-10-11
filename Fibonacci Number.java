import java.util.Scanner;
/**
 * Fibonacci
 */
public class Fibonacci {

    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int n,a=0,b=1,c;
            System.out.print("Enter range:");
            n=input.nextInt();
            while (a<=n) {
                System.out.print(a+",");
                c=a+b;
                a=b;
                b=c;
            }
    }
}