public abstract class Student {
    String name;
    String department;
    String matricNo;

    void goToClass() {
        System.out.println("School sturv");
    }

    abstract void goToCBT();
}

class CourseRep extends Student {
    void visitLA() {
        System.out.println("Visit LA");
    }

    void goToClass() {
        System.out.println("i dey go school abeg.");
    }

    void goToCBT() {
        System.out.println("CBT is behind comsit");
    }
}

class testrun {
    public static void main(String[] args) {
        // Student myobj = new Student();

        CourseRep optimist = new CourseRep();
        // Student barry = new Student();
        optimist.goToCBT();
    }
}
