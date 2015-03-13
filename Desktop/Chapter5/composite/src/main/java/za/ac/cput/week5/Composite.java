package za.ac.cput.week5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2015/03/10.
 */
public class Composite implements Book {

    List<Book> books=new ArrayList<Book>();


    @Override
    public String author()
    {
        for (Book book :books) {
            book.author();
        }
       return author();
    }
    @Override
    public String reader()
    {

        for (Book book :books) {
            book.reader();
        }
        return reader();
    }

    public void add(Book book)
    {
        books.add(book);
    }

    public void remove(Book book)
    {
        books.remove(book);
    }

    public List<Book>getBooks()
    {
        return books;
    }

    public Book getBook(int pointer)
    {
        return books.get(pointer);
    }
}
