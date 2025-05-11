public class Book {
    private String title;
    private String author;
    boolean isAvailable;

    public Book(String title, String author) {
        setTitle(title);
        setAuthor(author);
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setTitle(String _title) {
        this.title = _title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String _author) {
        this.author = _author;
    }

    public String getAuthor() {
        return author;
    }

    public void borrow() {
        this.isAvailable = false;
    }

    public void returnBook() {
        this.isAvailable = true;
    }

}
