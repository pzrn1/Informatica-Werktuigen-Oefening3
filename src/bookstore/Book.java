package bookstore;


public class Book {
	private String title;
	private String author;
	private int publication_year;



	public Book(String title, String author, int publication_year) {
		this.title = title;
		this.author = author;
		this.publication_year = publication_year;
	}


	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return this.author;
	}

	public int getPublicationYear() {
		return this.publication_year;
	}


	public String toString() {
		return String.format("'%s', written by '%s' in %d", 
			this.getTitle(), this.getAuthor(), this.getPublicationYear());
	}
}