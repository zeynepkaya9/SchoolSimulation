
public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+" Adl? ki?i eklendi.");
	}
	
	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}
	
}
