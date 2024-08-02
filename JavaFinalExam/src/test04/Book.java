package test04;

public class Book {
	public String title;
	public String author;
	public String isbn;
	public boolean isBorrowd;


	public Book(String title, String author, String isbn, boolean isBorrowd) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;

		this.isBorrowd = false;

	}
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void getBookInfo() {

	}



}
