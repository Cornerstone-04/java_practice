package components.week_2;

public class MethodOverloading1 {
	int Number1, Number2, Number3; // data members
// Constructor MethodOverloading1 id overloaded using different number of arguments
	//However, constructors do not have return types
	MethodOverloading1()
	{ Number1=1; Number2=2; Number3=3;
	}
	
	MethodOverloading1(int num1, int num2)
	{ Number1=num1; Number2=num2;
	}
	
	MethodOverloading1(int num1, int num2, int num3)
	{ Number1=num1; Number2=num2; Number3=num3;
	}
// Function AddNumbers is overloaded based on different number of arguments
	int AddNumbers ()
	{ return Number1+Number2+Number3;
	}
	int AddNumbers (int N1, int N2)
	{
		return N1+N2;
	}
	int AddNumbers (int N1, int N2, int N3)
	{
		return N1+N2+N3;
	}
// main() for execution
	public static void main(String[] args) {
	MethodOverloading1 OBJ1 = new MethodOverloading1();
	MethodOverloading1 OBJ2 = new MethodOverloading1(5,6);
	MethodOverloading1 OBJ3 = new MethodOverloading1(7,8,9);

	System.out.println("OBJ1 : "+OBJ1.AddNumbers());
	System.out.println("OBJ2 : "+OBJ2.AddNumbers(4,5));
	System.out.println("OBJ3 : "+OBJ3.AddNumbers(2,3,4));
	}
}
