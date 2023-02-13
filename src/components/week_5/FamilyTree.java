package components.week_5;

//Multilevel Inheritance in Java
class FamilyTree {
    String FamilyName = "Owonikoko";

    public String getFamilyName() {
        return FamilyName;
    }
}

// Subclass Father of Superclass FamilyTree
class Father extends FamilyTree {
    String Name = "Odogwu";

    public String getName() {
        return Name;
    }
}

// Subclass son of Superclass Father
class Son extends Father {
    String Name = "Portable";

    public String getName() {
        return Name;
    }

    public String GetFathersName() {
        return super.getName(); // Accessing the inherited Father's Name
    }
}

// A class to execute the code
class multilevel {
    public static void main(String args[]) {
        Son FirstSon = new Son();
        System.out.println("This house belongs to " + FirstSon.getFamilyName() + " Family. It is not for sale.");
        System.out.println("Beware of my son " + FirstSon.getName() + " the First son of " + FirstSon.GetFathersName());
    }
}
