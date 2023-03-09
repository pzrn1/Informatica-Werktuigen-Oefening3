package bookstore;


class Main {

	public static void main(String[] args) {
		BookStore store = new BookStore("The BookWorm");


		store.addBook(new Book("Max Havelaar", "Multatuli", 1860));
		store.addBook(new Book("1984", "George Orwell", 1949));
		store.addBook(new Book("Lord of the Flies", "William Golding", 1954));

		System.out.println(store.toString());
	}
}
