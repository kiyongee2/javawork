package test;

public class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book book = (Book)obj;
			if(this.bookNumber == book.bookNumber)
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return bookNumber;
	}
	
	
}
