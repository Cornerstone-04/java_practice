package components.week_8;

import java.io.IOException;
import java.util.Random;

public class ExceptionDemo {
	int GetArrayValue(int[] ArrNum, int index) {
		int Num = 0;
		try {
			Num = ArrNum[index];
		} catch (ArrayIndexOutOfBoundsException Ex) {
			System.out.println("Error, index value out of range.");
		}
		return Num;
	}

	public static void main(String[] args) {
		int[] Array1 = null;
		int ArraySize = 0;
		try {
			Array1 = new int[ArraySize];
			Random rand = new Random();
			for (int i = 0; i < ArraySize; i++)
				Array1[i] = rand.nextInt();
			int Summation = 0;
			for (int i = 0; i < ArraySize; i++)
				Summation = Summation + Array1[i];
			System.out.println("Average value " + Summation / ArraySize);
			System.out.println(" Enter the position, [0," + (ArraySize - 1) + "] of the array component to retrieve");
			int NewNumber = System.in.read();
			NewNumber = NewNumber - '0';
			System.out.println("Array1[" + NewNumber + "]=" + Array1[NewNumber]);
		} catch (IOException E) {
			System.out.println("Error: Input Error" + E);
		} catch (ArithmeticException E) {
			System.out.println("Error: Division by zero");
		} catch (NullPointerException E) {
			System.out.println("Error: Null pointer. Array not allocated memory");
		} catch (ArrayIndexOutOfBoundsException E) {
			System.out.println("Error: Array index is out of range");
		} finally {
			System.out.println("This is the final block");
		}
	}
}
