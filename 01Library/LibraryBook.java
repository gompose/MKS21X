// Line 18

public abstract class LibraryBook extends Book implements Comparable<LibraryBook> {
  private String callNumber;
  
  public LibraryBook(String author, String title, String isbn, String callNumber){
      setAuthor(author);
      setTitle(title);
      setIsbn(isbn);
      this.callNumber = callNumber;
  }
  public String getCallNumber() {
    return callNumber;
  }
    public void setCallNumber(String callNumber) {
	this.callNumber = callNumber;
    }
  public abstract void checkout(String patron, String due);
  public abstract void returned();
  public abstract String circulationStatus();
  // NOTE: Unfinished, still need comparable and etc.
  public int compareTo(LibraryBook o){
      return getCallNumber().compareTo(o.getCallNumber());
  }

  public String toString(){
      return "Title: " + getTitle() + "\n" + "Author: " + getAuthor() + "\n" + "ISBN: " + getIsbn() + "\n" + "CallNumber: " + getCallNumber();
  }
  
  
}
