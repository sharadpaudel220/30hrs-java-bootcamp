import java.util.Scanner;
public class Add 
{
public static void main (String [] args)
{
    Scanner khoj = new Scanner(System.in);
    System.out.println("enter two numbers");
    int x = khoj.nextInt();
    int y = khoj.nextInt();
    
    int sum = x+y;
    System.out.println("the sum is:" +sum);
}
}