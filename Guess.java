import java.util.Scanner;
public class Guess
{
public static void main(String[] args)
{
    Scanner don = new Scanner(System.in);
    System.out.println("enter a character");
    char haaleko = don.next().charAt(0);

    if(haaleko=='A')
    {
    System.out.println("the input is correct");
    }
    else
    {
    System.out.println("the input is false");
    }
 }
}   
    