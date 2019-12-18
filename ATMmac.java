import java.util.Scanner;
public class ATMmac
{
public static void main (String [] args)
{
    Scanner khoj = new Scanner(System.in);
    System.out.println("enter a pin");
    int pin = khoj.nextInt();
    int count = 0;
    do
    {
     if (count <3)
     {
        System.out.println("count =" +count);
        System.out.println("try a valid pin again");
        pin = khoj.nextInt();
        count++;
        }
    }
    while (pin != 1234);
    {
    if(pin == 1234) 
    {
    System.out.println("welcome to our bank :");
    }
    
    }
 
}
}