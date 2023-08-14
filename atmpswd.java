import java.util.Scanner;
public class atmpswd 
{
public static void main(String[]args){
	String username,password,a,b,ENTER;
	double M,AMOUNT,WITHDRAW,balance;
Scanner input = new Scanner(System.in);
	System.out.println("Username :");
	username = input.next();
	System.out.println("password :");
	password = input.next();
a = "Abhijith";
b ="2456";	
if(username.equals(a)&&(password.equals(b)))
{
	 System.out.println("1.savings Acc");
	 System.out.println("2.current Acc");
	 System.out.println("3.Balance Enquiry");}
     ENTER = input.next(); 
     M = 9000;
     System.out.println("ENTER THE AMOUNT");
     AMOUNT = input.nextInt();
     if (AMOUNT>M){
	System.out.println("INSUFFICIENT BALANCE");
	System.out.println("AVAILABLE BALANCE"+M);}
    else
    {	
    	System.out.println("withdraw succesfully");
    balance = M - AMOUNT ;
    System.out.println("BALANCE AMOUNT"+balance);
    }
     
     
}

	
}



