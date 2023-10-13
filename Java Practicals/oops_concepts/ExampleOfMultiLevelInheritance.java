package oops_concepts;

/**
 * This program is used to demonstrate multi line inheritance
 * 
 * @author Aayushi Agrawal
 * @since 01-09-2023
 */
class GrandParentClass {

	void grandParentName() {
		System.out.print("Grand Parent Name");
	}

}

class ParentsClass extends GrandParentClass {

	void parentName() {
		System.out.print("Parent Name ");
	}

}

class ChildrenClass extends ParentsClass {

	void childName() {
		System.out.print("Children Name ");
	}

}

public class ExampleOfMultiLevelInheritance {

	public static void main(String[] args) {
		ChildrenClass childrenclass = new ChildrenClass();
		childrenclass.childName();
		childrenclass.parentName();
		childrenclass.grandParentName();
	}

}
