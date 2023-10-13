package oops_concepts;

/**
 * This program is used to demonstrate single inheritance
 * 
 * @author Aayushi Agrawal
 * @since 01-09-2023
 */
class ParentClass {

	void display() {
		System.out.println("This output is from Parent Class ");
	}

}

class ChildClass extends ParentClass {

	void show() {
		System.out.println("This output is from Child Class ");
	}

}

public class SingleInheritance {

	public static void main(String[] args) {
		ChildClass childclass = new ChildClass();
		childclass.show();
		childclass.display();
	}

}
