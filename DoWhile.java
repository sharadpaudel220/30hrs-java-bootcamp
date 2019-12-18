import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int pin = 0;
        int count=0;
        System.out.println("Enter a pin");
        do{
          pin = input.nextInt();
            if(count<3){
                System.out.println("Count = "+count);
                System.out.println("Enter your pin number again");
                pin = input.nextInt();
                count++;

            } else {
                System.out.println("Blocked");
                break;
            }

               }   while(pin != 123);
            if (pin == 123)
            {
                System.out.println("welcome to sunway bank limited");
        
                int balance = 10000 ,  withdraw, deposit;
                while(true)
                {
                System.out.println("please enter 1 : To check your balance \n 2 : To withdraw the amount \n 3: To deposit the amount");
                
                int choice = input.nextInt();
    
                switch(choice)
                {
                 case 1: 
                 System.out.println("your balance is " +balance);
                 break;
        
                 case 2:
                 System.out.println("enter the amount to withdraw");
                 withdraw = input.nextInt();       
                 if (withdraw < balance)
                  {
                     balance = balance - withdraw;
                     System.out.println("your new balance is" +balance);
                    }
                    break;
            
                    case 3 :
                    System.out.println("enter the amount to deposit");
                    deposit = input.nextInt();
                    balance= deposit + balance;
                    System.out.println("you have deposited " +deposit );
                    System.out.println("And your total balance is" +balance);
                    break;
        
                    default :
                    System.out.println("enter a valid point");
                }
                 System.out.println("Do you want a printed receipt? press 0 for printed recepit!");
                 int recepit = input.nextInt();
                 System.out.println("your balance is " +balance );
            }
        
        }
    }
}
