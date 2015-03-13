package za.ac.cput.week5;

/**
 * Created by student on 2015/03/10.
 */
public class Author implements Book {
    String writing;

    public Author(String writing)
    {
        this.writing=writing;
    }

    @Override
    public String author()
    {
      return ("I the writer is "+ writing);
    }
    @Override
    public String reader()
    {
        return ("The writer is still "+ writing);
    }

}
