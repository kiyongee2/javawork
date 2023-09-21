package basicclass.dog;

class MyDog{
	String name;
	String type;
	
	public MyDog(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	/*@Override
	public String toString() {
		return type + " " + name;
	}*/
}

public class DogTest {

	public static void main(String[] args) {
		
		MyDog dog = new MyDog("멍멍이", "진돗개");
		//System.out.println(dog);
		System.out.println(dog.getType() + " " + dog.getName());
	}

}
