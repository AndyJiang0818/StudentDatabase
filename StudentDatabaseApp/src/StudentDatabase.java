import java.util.*;

public class StudentDatabase {

	public static void main(String[] args) {
		// Ask how many new students
		System.out.print("Enter how many new students: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		// Create new students
		for (int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
		}
		
		for (int i = 0; i < numOfStudents; i++) {
			System.out.println("----------------------------------------\n" 
					+ students[i].toString());
		}
	}

}
