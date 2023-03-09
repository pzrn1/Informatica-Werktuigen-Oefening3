package bookstore;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;


public class BookStore {
	private String name;
	private List<Book> collection;


	public BookStore(String name) {
		this.name = name;
		this.collection = new ArrayList<>();
	}


	public void addBook(Book book) {
		this.collection.add(book);
	}

	public int getAmtBooks() {
		return this.collection.size();
	}

	public String getName() {
		return this.name;
	}


	public List<Book> getBooksByAuthor(String author) {
		return this.collection.stream()
			.filter(b -> b.getAuthor().equals(author))
			.collect(Collectors.toList());
	}


	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(String.format("Book store \"%s\"\n", this.name));
		for (var book : collection) {
			builder.append(String.format("\t%s\n", book.toString()));
		}
		return builder.toString();
	}

}