

public abstract class LibraryBook extends Book implements Comparable<LibraryBook> {
  String callNumber;
  
  public LibraryBook(String author, String title, String isbn, String callNumber){
    this.author = author;
    this.title = title;
    this.isbn = isbn;
    this.callNumber = callNumber;
  }
  public String getCallNumber() {
    return callNumber;
  }
  public abstract void checkout(String patron, String due);
  public abstract void returned();
  public abstract String circulationStatus();
  // NOTE: Unfinished, still need comparable and etc.
  
}
