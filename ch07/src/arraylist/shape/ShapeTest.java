package arraylist.shape;

import java.util.ArrayList;

//도형 클래스
class Shape{
	public void draw() {
		System.out.println("Shape");
	}
}

//원이 도형 클래스를 상속 받음
class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

class Triangle extends Shape{

	@Override
	public void draw() {
		System.out.println("Triangle");
	}
	
}

public class ShapeTest {

	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<>();
		
		//list에 객체 저장
		list.add(new Circle());
		list.add(new Triangle());
		list.add(new Shape());
		
		//list 출력
		for(Shape s : list) {
			s.draw();
		}
	}

}
