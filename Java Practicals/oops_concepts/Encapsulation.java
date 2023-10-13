package oops_concepts;

/**
 * This program is used to demonstrate encapsulation
 * 
 * @author Aayushi Agrawal
 * @since 01-09-2023
 */
public class Encapsulation {

	public int rollno;
	public String name;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Encapsulation [rollno=" + rollno + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
		encapsulation.rollno = 5;
		encapsulation.name = "Srashti";
		System.out.println(encapsulation.getRollno());
		System.out.println(encapsulation.getName());
	}

}
