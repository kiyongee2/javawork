package test;

public class StringCharAt {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		char charVal = subject.charAt(0);
		System.out.println(charVal);
		
		String 주민등록번호 = "950815-2234567";
		char gender = 주민등록번호.charAt(7);
		System.out.println(gender);
		switch(gender) {
		case '1': case '3':
			System.out.println("남");
			break;
		case '2': case '4':
			System.out.println("여");
			break;
		}
	}

}
