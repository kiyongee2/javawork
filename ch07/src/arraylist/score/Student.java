package arraylist.score;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	//ArrayList - Subject 객체를 저장할 배열(리스트)
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
	
	//학생의 정보 출력
	public void showStudentInfo() {
		int total = 0;  //총점 변수
		double avg;     //평균 변수
		for(int i = 0; i < subjectList.size(); i++) {
			Subject s = subjectList.get(i);
			total += s.getScorePoint(); //점수 더하기
			System.out.printf("학생 %s의 %s 과목의 점수는 %d점입니다.\n", studentName,
					s.getSubjectName(), s.getScorePoint());
		}
		//평균 계산
		avg = (double)total / subjectList.size();
		System.out.printf("%s의 총점은 %d점이고, 평균은 %.1f점입니다.", 
				studentName, total, avg);
	}
}
