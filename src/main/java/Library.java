import lombok.Data;

import java.util.List;

@Data
public class Library {
    private List<Book> books;

    public void addBook(Book book) {
        books.add(book);
    }
}
