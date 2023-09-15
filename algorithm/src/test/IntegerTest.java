package test;

public class IntegerTest {

	public static void main(String[] args) {
		Integer num1 = 100;
		int num2 = 200;
		int sum = num1.intValue() + num2;
		System.out.println(sum);
		
		Integer n1 = Integer.valueOf(100);
		System.out.println(n1);
		
		int n2 = Integer.parseInt("200");
		System.out.println(n2);
	}
}
