package Exception;

public class myexception1 {
	 public static void main (String args[])
	 {
		 //String str = null;
		 //System.out.println(str.length());
		
		 try {
			 int num = Integer.parseInt("Aparna");
			 System.out.println(num);
		 }
		 finally {
			 System.out.println("Finally is always executed");
		 }
	 }
} 

