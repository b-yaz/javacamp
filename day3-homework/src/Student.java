
public class Student extends User {
	private String studentNumber;

	public Student() {
		
	}
	
	public Student(int id, String username, String password, String firstName, String lastName, String avatar) {
		super(id, username, password, firstName, lastName, avatar);
	}
	
	public Student(int id, String username, String password, String firstName, String lastName, String avatar, String studentNumber) {
		this(id, username, password, firstName, lastName, avatar);
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	
}
