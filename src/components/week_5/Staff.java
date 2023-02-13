package components.week_5;

// Super Class
class Staff {
    int salary = 60000;
    String FullName = "Samuel Afolabi";

    public String GetFullname() {
        return FullName;
    }
}

// Sub Class
class Lecturer extends Staff {
    int benefits = 10000;
    public String Staff_ID = "S6000";
}

// Driver Class
class Driver {
    public static void main(String args[]) {
        Lecturer CSC233_Lecturer = new Lecturer();
        System.out.println("Dear " + "Prof. " + CSC233_Lecturer.GetFullname() +
                " with Staff ID: " + CSC233_Lecturer.Staff_ID + ", your salary is " +
                CSC233_Lecturer.salary + " and your Pension is " + CSC233_Lecturer.benefits);

    }
}
