package components.week_5;

// Java Program for Method Overriding
class Subtraction {
    void Display() {
        System.out.println("This is the parent class");
    }
}

class Child1 extends Parent {
    @Override
    void Display() {
        System.out.println("This is Child1");
    }
}

class Child2 extends Parent {
    void Display() {
        System.out.println("This is Child2");
    }
}

class Test3 {
    public static void main(String[] args) {
        Parent ParentObject = new Parent();
        ParentObject.Display();

        Parent Object1 = new Child1();
        Object1.Display();

        Parent Object2 = new Child2();
        Object2.Display();

        Child1 Child1Object = new Child1();
        Child1Object.Display();

        Child2 Child2Object = new Child2();
        Child2Object.Display();
    }
}