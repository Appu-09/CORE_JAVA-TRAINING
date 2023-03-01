package loops;
// Program to print multiplication table  of a positive integer
import java.util.Scanner;

public class Table {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Please do enter any positive integer :  ");
		num = sc.nextInt();
		
		System.out.println("Multiplication table of " + num);
		for(int i=1;i <=10;i++)
		{
			System.out.println(num + " x " + i + " = " + (num*i));
		}
	}

}
