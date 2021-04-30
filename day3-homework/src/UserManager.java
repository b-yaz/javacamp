
public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanýcý eklendi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanýcý güncellendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanýcý silindi.");
	}
	
	public User[] getAll() {
		System.out.println("Tüm kullanýcýlar listelendi.");
		return new User[] {};
	}
	
	public User getById(int id) {
		System.out.println("Kullanýcý getirildi.");
		return new User();
	}
	
	public User getByUsername(String username) {
		System.out.println("Kullanýcý adý ile eþleþen kullanýcý getirildi.");
		return new User();
	}
	
	public Course[] getCourses(int userId) {
		System.out.println("Kullanýcýya ait kurs listesi alýndý.");
		return new Course[] {};
	}
}
