package components;

/**
 * 
 */

/**
 * @author balog
 *
 */
public class DefaultConstructors {
// Data members of the class
	int Number1;
	float Number2;
	char char1;
	boolean Bool;
	
	public static void main(String[] args) {
		// An object is created using new operator
		DefaultConstructors Obj1 = new DefaultConstructors();
		// Default constructor is automatically invoked
	   
//Output statements to display the values of the data members of Obj1
		System.out.println("Default Value:");
	    System.out.println("Number1 = " + Obj1.Number1);
	    System.out.println("Number2 = " + Obj1.Number2);
	    System.out.println("char1 = " + Obj1.char1);
	    System.out.println("Bool = " + Obj1.Bool);
	}

}
