package loops;
//Program to enter the numbers till the user wants to and display the count of positive ,negative and zero
import java.util.Scanner;

public class CountingNumbers {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int num,
		  countPositive = 0,
		  countNegative = 0,
		  countZero = 0;
		
		char choice;
		 do
		 {
			 System.out.println("Enter the number");
			 num = sc.nextInt();
			 if (num > 0)
			 {
				 countPositive++;
			 }
			 else if(num<0)
			 {
				 countNegative++;
			 }
			 else
			 {
				 countZero++;
			 }
     System.out.println("Do you want to continue  again y/n? ");
     choice =  sc.next().charAt(0);
		 }while(choice=='y' || choice=='Y');
	        System.out.println("Positive numbers: " + countPositive);
	        System.out.println("Negative numbers: " + countNegative);
	        System.out.println("Zero numbers: " + countZero);
	    
			
	}

}
