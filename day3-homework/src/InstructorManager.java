
public class InstructorManager extends UserManager {
	
	public void add(Instructor instructor) {
		System.out.println("E�itmen eklendi.");
		super.add(instructor);
	}
	
	public void update(Instructor instructor) {
		System.out.println("E�itmen kayd� g�ncellendi");
		super.update(instructor);
	}
	
	@Override
	public Course[] getCourses(int instructorId) {
		System.out.println("E�itmene ait kurslar listelendi.");
		return new Course[] {};
	}
}
