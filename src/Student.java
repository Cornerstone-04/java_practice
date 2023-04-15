public abstract class Student {
    String name;
    String department;
    String matricNo;
    private Object age;

    void setAge(Object num) {
        // if (num > 0) {
        // this.age = num;
        // } else {
        // this.age = 0;
        // }

        this.age = num;
    }

    Object getAge() {
        return this.age;
    }

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
        optimist.goToCBT();
        optimist.setAge('p');
        System.out.println(optimist.getAge());
        Student sodiq = (Student) optimist;
    }
}
