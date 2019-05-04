import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibraryTest {

    @Test
    public void addBookTest() {
        Library library = mock(Library.class);

        library.addBook(new Book("The Hobbit", 304, "J.R.R. Tolkien"));
        verify(library).addBook(new Book("The Hobbit", 304, "J.R.R. Tolkien"));
    }
}