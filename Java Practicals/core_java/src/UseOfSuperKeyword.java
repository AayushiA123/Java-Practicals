package aayushi_practice;

/**
 * This program demonstrate the use of Super Keyword.
 *
 * @author Aayushi Agrawal
 * @since 31-08-2023
 */
class Vehicle {

	String color = "white";

}

class Car extends Vehicle {

	String color = "black";

	void printColor() {
		System.out.println(color);// prints color of Car class
		System.out.println(super.color);// prints color of Vehicle class
	}

}

class UseOfSuperKeyword {

	public static void main(String[] args) {
		Car car = new Car();
		car.printColor();
	}

}