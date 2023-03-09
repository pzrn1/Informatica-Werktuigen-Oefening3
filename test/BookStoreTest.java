

import bookstore.Book;
import bookstore.BookStore;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class BookStoreTest {

	@Test
	public void testBookStoreEmpty() {
		BookStore bs = new BookStore("");

		assertEquals(0, bs.getAmtBooks());
	}


	@Test
	public void testBookStoreStandard() {
		BookStore bs = new BookStore("My book store");

		var b1 = new Book("Title1", "Author1", 0);
		var b2 = new Book("Title2", "Author1", 0);
		var b3 = new Book("Title3", "Author2", 0);
		var b4 = new Book("Title4", "Author3", 0);

		bs.addBook(b1);
		bs.addBook(b2);
		bs.addBook(b3);
		bs.addBook(b4);


		assertEquals("My book store", bs.getName());

		assertEquals(4, bs.getAmtBooks());
		assertEquals(2, bs.getBooksByAuthor("Author1").size());
		assertEquals(1, bs.getBooksByAuthor("Author2").size());
		assertEquals(1, bs.getBooksByAuthor("Author3").size());

		assertTrue(bs.getBooksByAuthor("Author1").contains(b1));
		assertTrue(bs.getBooksByAuthor("Author1").contains(b2));
	}



	@Test
	public void testFictitiousAuthor() {
		BookStore bs = new BookStore("");

		// Make sure the application does not crash when we look up authors
		// that do not have any books registered in the book store
		assertEquals(0, bs.getBooksByAuthor("IDoNotExist").size());
	}
}

