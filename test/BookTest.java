
import bookstore.Book;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class BookTest {

	@Test
	public void testDefault() {
		Book book = new Book("Java For Dummies (7th edition)", "Barry Burd", 2017);
		// Book book = new Book("Karel ende Elegast", "", 1270);

		assertEquals("Java For Dummies (7th edition)", book.getTitle());
		assertEquals("Barry Burd", book.getAuthor());
		assertEquals(2017, book.getPublicationYear());
	}
}