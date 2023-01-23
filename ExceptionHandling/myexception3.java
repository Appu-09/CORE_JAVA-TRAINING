package Exception;

public class myexception3 {
	static void avg() throws ArithmeticException
	{
		System.out.println("Inside avg function");
		throw new ArithmeticException("Aparna");
	}
	public static void main (String args[])
	{
		try {
			avg();
		}
		finally
		{
			System.out.println("Caught");
		}
	}

}
