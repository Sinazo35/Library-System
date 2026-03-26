//Book Factory Test
// Author: Nomhle Ngengele 216227488
// Date: 16 March 2026

package factory;

import domain.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;



public class BookFactoryTest {
    
    @Test
    void testCreateBasicBook() {
        Book book = BookFactory.createBasicBook("B001", "978-0134685991", "Effective Java");
        
        assertNotNull(book);
        assertEquals("B001", book.getBookId());
        assertEquals("978-0134685991", book.getIsbn());
        assertEquals("Effective Java", book.getTitle());
    }
    
    @Test
    void testCreateBook() {
        Book book = BookFactory.createBook(
                "B002",
                "978-0596007126",
                "Head First Java",
                "Bert Bates",
                "Programming",
                "O'Reilly",
                2005
        );
        
        assertNotNull(book);
        assertEquals("B002", book.getBookId());
        assertEquals("978-0596007126", book.getIsbn());
        assertEquals("Head First Java", book.getTitle());
        assertEquals("Bert Bates", book.getAuthor());
        assertEquals("Programming", book.getSubject());
        assertEquals("O'Reilly", book.getPublisher());
        assertEquals(2005, book.getPublicationYear());
    }
}
