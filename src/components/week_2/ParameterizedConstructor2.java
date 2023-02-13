package components.week_2;

class ParameterizedConstructor2 {
	// Data members of the class
	int Number1;
	float Number2;
	char char1;
	boolean Bool;
//Parameterized constructors are created to assign values to the data members of the class	
	ParameterizedConstructor2(int num1, float num2)// Parameterized Constructor with 2 arguments (parameters)
	{
		Number1 = num1;
		Number2 = num2;
	}
// A Copy constructor
	ParameterizedConstructor2(ParameterizedConstructor2 ParaCon)// Parameterized Constructor with 2 arguments (parameters)
	{
		Number1 = ParaCon.Number1;
		Number2 = ParaCon.Number2;
	}
	
	public float AddValues() // A function to return the addition of Number 1 and Number 2
	{
		return Number1 + Number2;
	}
}
class Driver {  // A new class to define the main () and execute the code

	public static void main(String[] args) {
//Obj1 is created as an object of class ParameterizedConstructor2 and initialized with a parameterized constructor
		ParameterizedConstructor2 Obj1 = new ParameterizedConstructor2(5, 6.0f);
		System.out.println("Addition = " + Obj1.AddValues());
		
//Obj2 is created as an instance of class ParameterizedConstructor2 and initialized with Obj1
		ParameterizedConstructor2 Obj2 = new ParameterizedConstructor2(Obj1);
	    System.out.println("Addition = " + Obj2.Number2);
	    System.out.println("Addition = " + Obj2.AddValues());
	}

}

