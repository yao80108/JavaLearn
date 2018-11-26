package ch3;

public class VariableDemo {
	public static void main(String[] args) {
		int ageOfStudent = 5;
		double scoreOfStudent = 80.0;
		char levelOfStudent = 'B';

		System.out.println("age\t score\t level");
		System.out.printf("%d\t %4.1f\t %c", ageOfStudent, scoreOfStudent, levelOfStudent);
	}
}
