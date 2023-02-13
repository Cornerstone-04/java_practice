package components.week_7;
//Java program to demonstrate Interfaces
interface Vehicle {
	
	// all are the abstract methods.
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakes(int a);
}
class Car implements Vehicle{
	int speed;
	int gear;
	// to change gear
	@Override
	public void changeGear(int newGear){
		gear = newGear;
	}
	// to increase speed
	@Override
	public void speedUp(int increment){
		speed = speed + increment;
	}
	// to decrease speed
	@Override
	public void applyBrakes(int decrement){
		speed = speed - decrement;
	}
	public void printStates() {
		System.out.println("speed: " + speed
			+ " gear: " + gear);
	}
}

class Bus implements Vehicle {
	
	int speed;
	int gear;
	
	// to change gear
	@Override
	public void changeGear(int newGear){
		
		gear = newGear;
	}
	
	// to increase speed
	@Override
	public void speedUp(int increment){
		
		speed = speed + increment;
	}
	
	// to decrease speed
	@Override
	public void applyBrakes(int decrement){
		
		speed = speed - decrement;
	}
	
	public void printStates() {
		System.out.println("speed: " + speed
			+ " gear: " + gear);
	}
	
}
class Driver1 {
	
	public static void main (String[] args) {
	
// creating an inatance of Bicycle
// doing some operations
Car SportCar = new Car();
SportCar.changeGear(2);
SportCar.speedUp(3);
SportCar.applyBrakes(1);
		
System.out.println("SportCar present state :");
SportCar.printStates();
		
		// creating instance of the bike.
Bus LongBus = new Bus();
LongBus.changeGear(1);
LongBus.speedUp(4);
LongBus.applyBrakes(3);
		
System.out.println("LongBus present state :");
LongBus.printStates();
	}
}

