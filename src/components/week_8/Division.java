package components.week_8;

// Java program to implement try, catch and finally
class Division {
	public static void main(String[] args) {
		int Num1 = 3, Num2 = 1, Num3 = 1, Num4;
		// The values assigned to Num1, Num2, and Num3 can be changed to other integer
		// values
		try { // try block
			Num4 = Num1 / (Num2 - Num3);
			System.out.println("The Final result is : " + Num4);
		} catch (ArithmeticException e) { // catch block
			System.out.println("Exception caught:Division by zero is not acceptable");
		} finally { // finally block
			System.out.println("This block will always be executed");
		}
	}
}
