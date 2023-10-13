package oops_concepts;

interface HumanBodys {
	void eyescolor();
	void haircolor();

}

class Mans implements HumanBodys {

	@Override
	public void eyescolor() {

		System.out.println("Blue");

	}

	@Override
	public void haircolor() {
		System.out.println("Black");

	}

}

public class ImplementationOFInterface {

	public static void main(String[] args) {
		Mans ram = new Mans();
		ram.eyescolor();
		ram.haircolor();
	}
}
