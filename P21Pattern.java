import java.util.Scanner;
//Butterfly Pattern-->
public class P21Pattern {
    public static void main(String [] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }   
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }     
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }   
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }     
            System.out.println();
        }
    }
}
