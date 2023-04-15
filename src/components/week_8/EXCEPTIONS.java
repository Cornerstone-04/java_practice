package components.week_8;

public class EXCEPTIONS {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			// Uncomment any of the java statements below for execution
			// e.printStackTrace();//exception information using printStackTrace() method
			// System.out.println(e.toString()); // exception information using toString()
			// method
			// System.out.println(e.getMessage());// exception information using
			// getMessage() method
		}
	}
}

/**
 * printStackTrace()– This method prints exception information in the format of
 * Name of the exception: description of the exception, stack trace.
 * 
 * toString() – This method prints exception information in the format of Name
 * of the exception: description of the exception
 * 
 * getMessage() -This method prints only the description of the exception.
 * 
 */