package components.week_5;

public class Inheritance_Car_Example {
    // the CAR class has two data items
    private int gear;
    private int speed;

    // the class Inheritance_Car_Example has one constructor
    public Inheritance_Car_Example(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // the Inheritance_Car_Example class has three methods
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    // toString() method to print info of CAR
    public String toString() {
        return ("No of gears are " + gear + "\n" + "speed of Car is " + speed);
    }
}

// subclass SportCar
class SportCar extends Inheritance_Car_Example {
    // the SportCar subclass adds one more data item
    public int NumberOfSeats;

    // the SportCar subclass has one constructor
    public SportCar(int gear, int speed, int NSeats) {
        // invoking superclass(Inheritance_Car_Example) constructor
        super(gear, speed);
        NumberOfSeats = NSeats;
    }

    // the SuperCar subclass adds one more method
    public void setNSeats(int newValue) {
        NumberOfSeats = newValue;
    }

    // overriding toString() method of Inheritance_Car_Example to print more info
    @Override
    public String toString() {
        return (super.toString() + "\nseat height is " + NumberOfSeats);
    }
}

class Test {
    public static void main(String args[]) {

        SportCar Ferrari = new SportCar(5, 500, 100);
        System.out.println(Ferrari.toString());
        Ferrari.speedUp(10);
        System.out.println(Ferrari.toString());

    }
}
