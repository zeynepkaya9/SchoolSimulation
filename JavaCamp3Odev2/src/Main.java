
public class Main {

	public static void main(String[] args) {
		StudentManager studentManager=new StudentManager();
		Student student1 = new Student(1, "Zeynep", "Kaya", "zeynep@mail.com", "Mat1, Fizik1", "123", 3.05);
		Student student2 = new Student(2, "Esra", "Karademir", "esrap@mail.com", "Mat1, Fizik1", "253", 2.65);
		Student student3 = new Student(3, "Burak", "Y�lmaz", "burak@mail.com", "Mat1, Fizik1", "653", 3.51);
		Student student4 = new Student(4, "Erdem", "�elik", "erdem@mail.com", "Mat1, Fizik1", "628", 2.10);
		studentManager.passingClass(student4);
		
		
		InstructerManager instructerManager =new InstructerManager();
		Instructer instructer1 = new Instructer(101, "Taner", "�en", "taner@mail.com",
				"Lineer Cebir, �statistik ve Olas�l�k", "2048,2036");
		Instructer instructer2 = new Instructer(102, "Halil", "Vural", "halil@mail.com", "Mat1, Mat2", "2040,2042");
		Instructer instructer3 = new Instructer(103, "Eyl�l", ",I��k", "eylul@mail.com", "Makine ��renmesi, Yapay Zeka",
				"2032,2038");
		Instructer instructer4 = new Instructer(104, "�eyda", "Tahtac�", "seyda@mail.com", "Algoritma1, Algoritma2",
				"2030,2056");
		instructerManager.CourseInClass(instructer1);
		
		
		UserManager userManager=new UserManager();
		User[] users = {student1,student2,student3,student4,instructer1,instructer2,instructer3,instructer4};
		userManager.addMultiple(users);

	}

}
