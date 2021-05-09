
public class Instructer extends User{
	private String givenCourses;
	private String classes;
	public Instructer(int id, String firstName, String lastName, String email, String givenCourses, String classes) {
		super(id, firstName, lastName, email);
		this.givenCourses = givenCourses;
		this.classes = classes;
	}
	public String getGivenCourses() {
		return givenCourses;
	}
	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	
	
	

}
