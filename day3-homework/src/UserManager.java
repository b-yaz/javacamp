
public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullan�c� eklendi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullan�c� g�ncellendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullan�c� silindi.");
	}
	
	public User[] getAll() {
		System.out.println("T�m kullan�c�lar listelendi.");
		return new User[] {};
	}
	
	public User getById(int id) {
		System.out.println("Kullan�c� getirildi.");
		return new User();
	}
	
	public User getByUsername(String username) {
		System.out.println("Kullan�c� ad� ile e�le�en kullan�c� getirildi.");
		return new User();
	}
	
	public Course[] getCourses(int userId) {
		System.out.println("Kullan�c�ya ait kurs listesi al�nd�.");
		return new Course[] {};
	}
}
