package arraylist.score;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}
	
	//과목 추가
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name, score); //매개변수로 외부에서 입력
		subjectList.add(subject); //어레이리스트에 저장함(0번부터 들어감)
	}
}
