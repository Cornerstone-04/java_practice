package components.week_5;

// Java program to demonstrate Upcasting Vs Downcasting
class Parent { // Parent class as Superclass
	String name;

	void Display() {
		System.out.println("Display Method from Parent");
	}
}

// Child class as Subclass
class Child extends Parent {
	int age;

	// Overriding the parent Display method to print the signature of the child
	// class
	@Override
	void Display() {
		System.out.println("Display Method from Child");
	}
}

class Test {
	public static void main(String[] args) {
		// Upcasting
		Parent Parent_Object = new Child();
		Parent_Object.name = "Portable";

		// Printing the parentclass data item "name"
		System.out.println(Parent_Object.name);
		// parent class Display method is overridden method hence this will be executed
		Parent_Object.Display();

		// Downcasting Implicitly will generate compile error
		// Child Child_Object1 = new Parent();

		// Downcasting Explicitly
		Child Child_Object2 = (Child) Parent_Object;
		Child_Object2.age = 100;
		System.out.println(Child_Object2.name);
		System.out.println(Child_Object2.age);
		Child_Object2.Display();
	}
}
