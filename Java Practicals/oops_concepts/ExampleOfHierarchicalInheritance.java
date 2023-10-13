package oops_concepts;

/**
 * This program is used to demonstrate hierarchical inheritance
 * 
 * @author Aayushi Agrawal
 * @since 01-09-2023
 */
class GrandParentsClass {

	void grandParentName() {
		System.out.print("Grand Parent Name");
	}

}

class FatherClass extends GrandParentsClass {

	void parentName() {
		System.out.print("Parent Name ");
	}

}

class OffSpringClass extends GrandParentsClass {

	void childName() {
		System.out.print("Children Name ");
	}

}

public class ExampleOfHierarchicalInheritance {

	public static void main(String[] args) {
		OffSpringClass offSpringClass = new OffSpringClass();
		offSpringClass.childName();
		offSpringClass.grandParentName();
	}

}
