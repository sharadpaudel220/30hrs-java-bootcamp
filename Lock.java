import java.util.Scanner;
public class Lock
{
public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int password = 0;
        int count = 0;
        System.out.println("enter the passcode:");
        do{  
        password = sc.nextInt();
        if(count<3)
    {
    System.out.println("count =" +count);
    System.out.println("enter the passcode again:");
    password = sc.nextInt();
    count++;
   }
   
   else 
    {
    System.out.println("Access denied!!:");
    }
}
        while(password!=1234);
        if(password == 1234)
        {
        System.out.println("you are verified");
        
        
        System.out.println("press 1 to check your password files \n press 2 to check your gallery \n press 3 to check your messages");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("press f for facebook password \n press i for instagram password \n press l for linkedin password");
            char S = sc.next().charAt(0);
            
            if(  S == 'f')
            {
            System.out.println("your facebook password is sharad123");
            }
            else if (S =='i')
            {
            System.out.println("your instagram password is hancyktomoh123");
            }
            else if (S=='l')
            {
            System.out.println("your linkedin password is prokto0123");
            }
            else
            {
            System.out.println("enter a valid character");
            }
            break;
            
            
        }
        }
       
}
}