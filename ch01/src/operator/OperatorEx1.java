package operator;

public class OperatorEx1 {

	public static void main(String[] args) {
		// 산술 연산자(상수) - +, -, *, /, %(나머지)
		// 계산의 결과는 기본이 정수형으로 됨
		// 자바의 기본형 - int, double임
		System.out.println(4 + 8); //12
		System.out.println(4 - 8); //-4
		System.out.println(4 * 8); //32
		System.out.println(4 /(double)8); //0.5, 형변환(type conversion)
		
		//나머지 연산자
		System.out.println(4 % 8); //4
		//홀수, 짝수 판별
		System.out.println(7 % 2); //1(홀수)
		
		System.out.println("==================");
		
		//산술 연산자(변수 사용)
		int a = 4;
		int b = 8;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println((double)a / b);
		
		//점수의 합계, 평균
		int korScore = 95;  //국어점수가 90점임('='은 대입연산자)
		int mathScore = 80;
		int sumScore;  //합계 변수 선언
		double avgScore; //평균 = 총점 / 과목수
		
		//sumScore = korScore + mathScore; //합계 계산
		//avgScore = (double)sumScore / 2;
		
		System.out.println("총점: " + sumScore(korScore, mathScore));
		//System.out.println("평균: " + avgScore);
	}
	
	private static int sumScore(int kor, int math) {
		return kor + math;
	}
	
}
