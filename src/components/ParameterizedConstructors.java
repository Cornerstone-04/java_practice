package components;

public class ParameterizedConstructors {
	// Data members of the class
			int Number1;
			float Number2;
			char char1;
			boolean Bool;
// Parameterized constructors are created to assign values to the data members of the class	
			ParameterizedConstructors(int num1) // Parameterized Constructor with 1 argument (parameter)
			{
				Number1 = num1;
				Number2= 35.6f;
				char1 = 'S';
				Bool = false;
			}
			ParameterizedConstructors(int num1, float num2)// Parameterized Constructor with 2 arguments (parameters)
			{
				Number1 = num1;
				Number2 = num2;
				char1 = 'T';
				Bool = true;
			}
			ParameterizedConstructors(int num1, float num2, char ch) // Parameterized Constructor with 3 arguments (parameters)
			{
				Number1 = num1;
				Number2 = num2;
				char1 = ch;
				Bool = false;
			}
			
			public static void main(String[] args) {
		// objects are created using new operator and assigned values via the parameterized constructors
				ParameterizedConstructors Obj1 = new ParameterizedConstructors(5);
				ParameterizedConstructors Obj2 = new ParameterizedConstructors(5, 6.0f);
				ParameterizedConstructors Obj3 = new ParameterizedConstructors(5, 9.0f, 'B');
			   
		//Output statements to display the values of the data members of Obj1, Obj2, and Obj3
			    System.out.println("Number2 = " + Obj1.Number2);
			    System.out.println("Bool = " + Obj2.Bool);
			    System.out.println("char1 = " + Obj3.char1);
			}

}
