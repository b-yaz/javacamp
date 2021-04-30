
public class InstructorManager extends UserManager {
	
	public void add(Instructor instructor) {
		System.out.println("Eðitmen eklendi.");
		super.add(instructor);
	}
	
	public void update(Instructor instructor) {
		System.out.println("Eðitmen kaydý güncellendi");
		super.update(instructor);
	}
	
	@Override
	public Course[] getCourses(int instructorId) {
		System.out.println("Eðitmene ait kurslar listelendi.");
		return new Course[] {};
	}
}
