import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LibraryTest {

    @Test
    public void addBookTest() {
        Library library = mock(Library.class);

        library.addBook(new Book("The Hobbit", 304, "J.R.R. Tolkien"));
        verify(library).addBook(new Book("The Hobbit", 304, "J.R.R. Tolkien"));
    }

    @Test
    public void verifyFindByTitle() {
        Library library = mock(Library.class);

        when(library.findByTitle("The Hobbit")).thenReturn(new Book("The Hobbit", 304, "J.R.R. Tolkien"));
        assertThat(library.findByTitle("The Hobbit"), is(new Book("The Hobbit", 304, "J.R.R. Tolkien")));
        verify(library).findByTitle(anyString());
    }

}