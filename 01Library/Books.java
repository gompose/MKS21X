public class Books{
    public String author;
    public String title;
    public String isbn;
    
    public Books() {
        author = "";
        title = "";
        isbn = "";
    }
    
    public Books(String author, String title, String isbn) {
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
    
    
}
