
public class StudentManager {
	public void takenCourses(Instructer instructer, Student student) {
		System.out.println(student.getFirstName()+" adl� ��renci "+student.getTakenCourses()+" dersini, "+
				instructer.getFirstName()+" hocas�ndan almaktad�r.");
	}
	public void passingClass(Student student) {
		if(student.getAvg()>2.00) {
			System.out.println(student.getFirstName()+" "+student.getAvg()+" ortalma ile s�n�f� ge�ti.");
		}
		else {
			System.out.println(student.getFirstName()+" "+student.getAvg()+" ortalma ile s�n�fta kald�.");
		}
	}

}
