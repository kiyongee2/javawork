package funcinterface.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// Calculator 변수 선언
		Calculator add, sub, mul, div;
		int num1 = 10, num2 = 5;
		
		// calculate()를 구현 - 람다식
		// 덧셈 구현
		add = (x, y) -> x + y;
		int value1 = add.calculate(num1, num2);
		System.out.println("두 수의 합: " + value1);
		
		// 뺄셈 구현
		sub = (x, y) -> x - y;
		int value2 = sub.calculate(num1, num2);
		System.out.println("두 수의 차: " + value2);
		
		// 곱셈 구현
		sub = (x, y) -> x * y;
		int value3 = sub.calculate(num1, num2);
		System.out.println("두 수의 곱: " + value3);
		
		// 나눗셈 구현
		sub = (x, y) -> x / y;
		int value4 = sub.calculate(num1, num2);
		System.out.println("두 수의 나누기: " + value4);
	}

}
