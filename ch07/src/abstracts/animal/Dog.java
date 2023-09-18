package abstracts.animal;

public class Dog extends Animal{
	//부모 클래스 추상메서드가 있으면 반드시 구현해야 함
	// unimplemented methods
	public Dog() {
		this.kind = "강아지";
		System.out.println(kind);
	}

	@Override
	public void sound() {
		System.out.println("멍~ 멍~");
	}
}
