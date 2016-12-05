public class Book{
    private String author;
    private String title;
    private String isbn;
    
    public Book() {
        author = "";
        title = "";
        isbn = "";
    }
    
    public Book(String author, String title, String isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }
    
    public String getIsbn() {
        return isbn;
    }
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String toString() {
        return "Title: " + title + "\n" + "Author: " + author + "\n" + "ISBN" + isbn;
    }
    
    
    
}
