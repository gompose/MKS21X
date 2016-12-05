public class ReferenceBook extends LibraryBook{
  private String collection;
  
  public ReferenceBook(String author, String title, String isbn, String callNumber, String collection) {
    this.author = author;
    this.title = title;
    this.isbn = isbn;
    this.callNumber = callNumber;
    this.collection = collection;
  }
  
  public String getCollection() {
    return collection;
  }
  public void setCollection(String collection){
    this.collection = collection;
  }
  
  public void checkout(String patron, String due){
    throw new UnsupportedOperationException("Cannot checkout a Reference Book");
  }
  public void returned(){
    throw new UnsupportedOperationException("Cannot return a Reference Book");
  }
  public String circulationStatus() {
    return "non-circulating reference book";
  }
  public String toString() {
    return "Title: " + title + "\n" + "Author: " + author + "\n" + "ISBN: " + isbn + "\n" + "CallNumber: " + callNumber + "\n" + "Collection: " + collection;
  }
  
  
}
