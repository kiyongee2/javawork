package data;

public class CharType {

	public static void main(String[] args) {
		// 문자 자료형 - char, String
		// 복제 - alt+ctrl+방향키(아래)
		// ASCII(Americal Standard Code for ..)
		//https://www.unicode.org/charts/PDF/UAC00.pdf
		char alpha = 'A';
		System.out.println(alpha);  //A
		System.out.println((int)alpha); //65(아스키 코드값), 형변환
		
		int alpha2 = 66;
		System.out.println(alpha2);  //66
		System.out.println((char)alpha2);  //B
		
		//유니코드 - 16bit - 2Byte
		char uniCode1 = '한';  //한 문자 - 홑따옴표
		System.out.println(uniCode1);
		
		char uniCode2 = '\uD55C';  //16진수 표기
		System.out.println(uniCode2); //한
		
		char uniCode3 = '\uAE00';
		System.out.println(uniCode3); //글
	}

}
