package components.week_5;

public class Courses { // Superclass Courses
	String Name;

	Courses(String Name) {
		this.Name = Name;
	}

	public String getCourseName() {
		return Name;
	}
}

// Subclass ComputerScience
class ComputerScience extends Courses {
	String CourseCode;

	ComputerScience(String Name, String CourseCode) {
		super(Name);
		this.CourseCode = CourseCode;
	}

	public String getCourseCode() {
		return CourseCode;
	}
}

// Subclass ComputerScienceEdu
class ComputerScienceEdu extends Courses {
	String CourseCode;

	ComputerScienceEdu(String Name, String CourseCode) {
		super(Name);
		this.CourseCode = CourseCode;
	}

	public String getCourseCode() {
		return CourseCode;
	}
}

class Build {
	public static void main(String[] args) {
		Courses CSC233 = new Courses("OOP using Java");
		System.out.println(CSC233.getCourseName());
		ComputerScience CSC = new ComputerScience("C Programming", "CSC231");
		System.out.println(CSC.getCourseName() + " " + CSC.getCourseCode());
		ComputerScienceEdu CSCEdu = new ComputerScienceEdu("C++ Programming", "CSC222");
		System.out.println(CSCEdu.getCourseName() + " " + CSCEdu.getCourseCode());
	}
}