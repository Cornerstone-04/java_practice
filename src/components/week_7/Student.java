package components.week_7;
// Abstract class
	abstract class Student {
	  // Abstract method (does not have a body)
		public abstract void DisplayDetails();
	  // Regular method
		public void DisplayName() {
		    System.out.println("Student Name");
		  }
	}

	// Subclass CSC_Stds inherits Class Student
	class CSC_Stds extends Student {
		public void DisplayDetails() {
	    // The body of DisplayDetails() is provided here
	    System.out.println("Details of Students");
	  }
	}

	class Driver {
	  public static void main(String[] args) {
	    CSC_Stds CSC233Stds = new CSC_Stds(); // Create a CSC_Stds object
	    CSC233Stds.DisplayDetails();
	    CSC233Stds.DisplayName();
	  }
	}
	
	
	