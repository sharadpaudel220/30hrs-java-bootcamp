import java.util.Scanner;
class Even_Oddtill4{
public static void main (String args[]){
int i;
Scanner scan=new Scanner(System.in);
//create a scanner object for input
System.out.print("Print all even number until:\n");
int num=scan.nextInt();//Reads input from user and stored in variable num
System.out.print("even number from i to "+num+" are: \n");
i=1;
do{               //loop for iterate from 1 to maximum
    if(i%2==0){
System.out.print(i+"\n");
}
i++;
}
while(i<=num);
 
}
}