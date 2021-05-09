
public class StudentManager {
	public void takenCourses(Instructer instructer, Student student) {
		System.out.println(student.getFirstName()+" adlý öðrenci "+student.getTakenCourses()+" dersini, "+
				instructer.getFirstName()+" hocasýndan almaktadýr.");
	}
	public void passingClass(Student student) {
		if(student.getAvg()>2.00) {
			System.out.println(student.getFirstName()+" "+student.getAvg()+" ortalma ile sýnýfý geçti.");
		}
		else {
			System.out.println(student.getFirstName()+" "+student.getAvg()+" ortalma ile sýnýfta kaldý.");
		}
	}

}
