
public class StudentManager extends UserManager {
	
	
	public void add(Student student) {
		System.out.println("Öğrenci eklendi.");
		super.add(student);
	}
	
	public void update(Student student) {
		System.out.println("Öğrenci kaydı güncellendi");
		super.update(student);
	}
	
	@Override
	public Course[] getCourses(int studentId) {
		System.out.println("Öğrenciye ait kurs listesi alındı.");
		return new Course[] {};
	}
}
