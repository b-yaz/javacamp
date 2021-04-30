
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(101, "kenan@kulaz.com", "123456@", "Kenan", "Kulaz", "kenan.jpg");
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);

		studentManager.getCourses(student.getId());
		
		Instructor instructor = new Instructor(102, "kenan@kulaz.com", "123456@", "Kenan", "Kulaz", "kenan.jpg");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		instructorManager.getCourses(instructor.getId());
	}

}
