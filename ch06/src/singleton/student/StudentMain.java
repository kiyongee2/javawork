package singleton.student;

public class StudentMain {

	public static void main(String[] args) {
		
		School school = School.getInstance();
		School school2 = School.getInstance();
		
		Student kim = school.createStudent();
		Student choi = school.createStudent();
		Student lee = school.createStudent();
		
		System.out.println("학번: " + kim.getStudentNum());
		System.out.println("학번: " + choi.getStudentNum());
		System.out.println("학번: " + lee.getStudentNum());
		
		//학교 객체의 주소
		System.out.println(school);
		System.out.println(school2);
		
		//학생 객체의 주소
		System.out.println(kim);
		System.out.println(choi);
		System.out.println(lee);
		
	}

}
