import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
public class Library {
    private List<Book> books;

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findByTitle(String title) {
        for(Book book : books) {
            if(book.getTitle().equals(title))
                return book;
        }

        return null;
    }
}
