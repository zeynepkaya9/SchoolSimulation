
public class Student extends User{
	private String takenCourses;
	private String studentNumber;
	private double avg;
	
	
	public Student(int id, String firstName, String lastName, String email, String takenCourses, String studentNumber,double avg) {
		super(id, firstName, lastName, email);
		this.takenCourses = takenCourses;
		this.studentNumber = studentNumber;
		this.avg=avg;
	}


	public String getTakenCourses() {
		return takenCourses;
	}


	public void setTakenCourses(String takenCourses) {
		this.takenCourses = takenCourses;
	}


	public String getStudentNumber() {
		return studentNumber;
	}


	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}


	public double getAvg() {
		return avg;
	}


	public void setAvg(double avg) {
		this.avg = avg;
	}
	

}
