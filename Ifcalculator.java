import java.util.Scanner;
public class Ifcalculator
 {
public static void main(String [] args)
    {
        Scanner khoj = new Scanner(System.in);
        int x,y, add, sub, multiply, divide;
        System.out.println("please enter two numbers:");
        x = khoj.nextInt();
        y = khoj.nextInt();
   
        
        char operation1 = khoj.next().charAt(0);
            if (operation1 == '+')
            {
            int sum = x+y;
            System.out.println("the sum is " +sum);
            }
       
            else if (operation1 == '-')
            {
                int diff = x-y;
                System.out.println("the difference is "+diff);
            }
        
                else if (operation1 == '*')
               {
                   int product = x*y;
                   System.out.println("the product is:" +product);
                }   
        
                else if (operation1 == '/')
                {
                    int division = x/y;
                    System.out.println("the division is "+division);
                }   
        
                else 
                {
                    System.out.println("please enter  a valid opreration");
                }   
        
      }
}