package aayushi_practice;

/**
 * This program demonstrate the use of This Keyword.
 *
 * @author Aayushi Agrawal
 * @since 31-08-2023
 */
class Student {

	int rollno;

	Student(int rollno) {
		this.rollno = rollno;
	}

	// For printing output
	void display() {
		System.out.println(rollno);
	}

}

class UseOfThisKeyword {

	public static void main(String[] args) {
		Student student = new Student(3);
		student.display();
	}

}