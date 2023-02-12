package components;

/**
 * 
 */

/**
 * @author balog
 *
 */
public class NoArgumentConstructors {
	// Data members of the class
		int Number1;
		float Number2;
		char char1;
		boolean Bool;
// A No-argument constructor is created to assign values to the data members of the class	
		NoArgumentConstructors()
		{
			Number1 = 500;
			Number2 = 60.85f;
			char1 = 'W';
			Bool = false;
		}
		public static void main(String[] args) {
	// An object is created using new operator
			NoArgumentConstructors Obj1 = new NoArgumentConstructors();
	// No-argument constructor is invoked to initialize the data members of Obj1
		   
	//Output statements to display the values of the data members of Obj1
			System.out.println("Default Value as assigned:");
		    System.out.println("Number1 = " + Obj1.Number1);
		    System.out.println("Number2 = " + Obj1.Number2);
		    System.out.println("char1 = " + Obj1.char1);
		    System.out.println("Bool = " + Obj1.Bool);
		}
}
