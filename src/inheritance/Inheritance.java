package inheritance;

//Parent class (superclass) or common class
class Vehicle {
	String name;

	Vehicle(String name) {
		this.name = name;
	}

	void move() {
		System.out.println(name + " is moving.");
	}

	void wheels() {
		System.out.println(name + " has wheels.");
	}
}

//Child class (subclass)
class Bike extends Vehicle {
	Bike(String name) {
		super(name); // Call the superclass constructor
	}

	void twowheels() {
		System.out.println(name + " is a two wheeler.");
	}
}

//Child class (subclass)
class Car extends Vehicle {
	Car(String name) {
		super(name); // Call the superclass constructor
	}

	void fourwheels() {
		System.out.println(name + " is a four wheeler.");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Bike myBike = new Bike("Ducati");
		Car myCar = new Car("Bugatti");

		myBike.move();
		myBike.wheels();
		myBike.twowheels();

		myCar.move();
		myCar.wheels();
		myCar.fourwheels();
	}
}
