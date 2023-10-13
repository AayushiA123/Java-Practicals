package oops_concepts;

/**
 * This program is used to demonstrate Hybrid inheritance
 * 
 * @author Aayushi Agrawal
 * @since 01-09-2023
 */
class HumanBody {

	void grandParentName() {
		System.out.println("Method defined inside HumanBody class");
	}

}

interface Male {
	public void display();
}

interface Female {
	public void display();
}

class HumanChild extends HumanBody implements Male, Female {
	
	@Override
	public void display() {
		System.out.println("Implementation of display() method defined in interfaces Male and Female");
	}

}

public class ExampleOfHybridInheritance {

	public static void main(String[] args) {
		HumanChild humanChild = new HumanChild();
		humanChild.grandParentName();
		humanChild.display();
	}

}
