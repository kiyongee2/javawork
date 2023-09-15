package test;

public class ToStringEx {

	public static void main(String[] args) {
		Book book1 = new Book(100, "개미");
		Book book2 = new Book(100, "개미");
		System.out.println(book1 == book2);
		System.out.println(book1.equals(book2));
		
		
	}

}
