package Exception;

public class myexception2 {
static void avg()
{
	try {
		throw new ArithmeticException("Aparna");
	}
	catch(ArithmeticException e)
	{
		System.out.println("Exception Caught");
	}
}
public static void main(String args[])
{
	avg();
}
}
