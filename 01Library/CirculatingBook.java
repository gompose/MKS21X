
public class CirculatingBook extends LibraryBook {
  private String currentHolder;
  private String dueDate;
  
  public CirculatingBook(String author, String title, String isbn, String callNumber){
    this.title = title;
    this.author = author; 
    this.isbn = isbn;
    this.callNumber = callNumber;
  }
  public String getCurrentHolder() {
    return currentHolder;
  }
  public String getDueDate() {
    return dueDate;
  }
  private void setCurrentHolder(String name) {
    currentHolder = name;
  }
  private void setDueDate(String date) {
    dueDate = date;
  }
  public void checkout(String name, String date) {
    setCurrentHolder(name);
    setDueDate(date);
  }
  public void returned() {
    currentHolder = null;
    dueDate = null;
  }
  public String circulationStatus() {
    String a;
    if (currentHolder == null && dueDate == null) {
      a = "book available on shelves";
    }else{
      a = "CurrentHolder: " + currentHolder + "\n" + "DueDate: " + dueDate;
    }
    return a;
  }
  public String toString() {
    return "Title: " + title + "\n" + "Author: " + author + "\n" + "ISBN: " + isbn + "\n" + "CallNumber: " + callNumber + "\n" + "CirculationStatus: " + circulationStatus();
  }
  
    
    
}
