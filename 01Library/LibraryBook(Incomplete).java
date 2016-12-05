// Line 18

public abstract class LibraryBook extends Book implements Comparable<LibraryBook> {
  private String callNumber;
  
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
  public int compareTo(LibraryBook o){
      return LibraryBook.getCallNumber().compareTo(o.getCallNumber());
  }

  public String toString(){
    return "Title: " + title + "\n" + "Author: " + author + "\n" + "ISBN: " + isbn + "\n" + "CallNumber: " + callNumber;
  }
  
  
}
