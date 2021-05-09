
public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+" Adlı kişi eklendi.");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
	
}
