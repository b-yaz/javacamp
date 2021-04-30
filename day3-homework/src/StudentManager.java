
public class StudentManager extends UserManager {
	
	
	public void add(Student student) {
		System.out.println("��renci eklendi.");
		super.add(student);
	}
	
	public void update(Student student) {
		System.out.println("��renci kayd� g�ncellendi");
		super.update(student);
	}
	
	@Override
	public Course[] getCourses(int studentId) {
		System.out.println("��renciye ait kurs listesi al�nd�.");
		return new Course[] {};
	}
}
