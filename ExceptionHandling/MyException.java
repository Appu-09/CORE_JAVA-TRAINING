package Exception;
 public class MyException{
	 public static void main (String args[])
	 {
		 //String str = null;
		 //System.out.println(str.length());
		 try {
			 int a = 30,b = 0;
			int c = a/b;
			System.out.println("result = "+c);
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("Cannot divide a number by zero");
		 }
		 try {
			 int num = Integer.parseInt("Aparna");
			 System.out.println(num);
	
		 }
		 catch(NumberFormatException e)
		 {
			 System.out.println("Number Format Exception");
		 }
		 try {
			 int a[] = new int[5];
			 a[7] = 9;
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("Array index out of bounds");
		 }
	 }
 } 
 
