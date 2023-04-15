package components.week_8;

// Java program to demonstrate working of throws
class ThrowsException {
	// This method throws an exception to be handled by caller or caller of caller
	// and so on.
	static void CheckStudent(int StudentAge) throws ArithmeticException {
		if (StudentAge < 14) {
			throw new ArithmeticException("Admission denied, You must be at least 15 years old.");
		} else {
			System.out.println("Admission granted");
		}
	}

	public static void main(String[] args) {
		CheckStudent(15); // Student Age is 15
		// CheckStudent(12); // Student Age is 12
	}
}
