import java.util.Scanner;
public class Switchcalculator
{
public static void main(String[] args)
{
Scanner khoj = new Scanner(System.in);
System.out.println("enter two numbers");
 int x = khoj.nextInt();
 int y = khoj.nextInt();
 
    System.out.println("enter a operation to follow:");
    String operation = khoj.next();
    char choice = operation.charAt(0);

      switch(choice)
      {
        case '+': 
        int sum = x+y;
        System.out.println("the sum is " +sum);
        break;
        
        case '-' :
        int diff = x-y;
        System.out.println("the diff is" +diff);
        break;
        
        case '*' :
        int product = x*y;
        System.out.println("the product is " +product);
        break;
        
        case '/' :
        int divide = x/y;
        System.out.println("the divison is"+divide);
        break;
        
       default:
       System.out.println("please enter a valid operation");
       
    }
}
}