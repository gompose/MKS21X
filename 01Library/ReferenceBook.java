public class ReferenceBook extends LibraryBook{
  private String collection;
  
  public ReferenceBook(String author, String title, String isbn, String callNumber, String collection) {
      super(author, title, isbn, callNumber);
      //setAuthor(author);
      //setTitle(title);
      //setIsbn(isbn);
      //setCallNumber(callNumber);
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
      return "Title: " + getTitle() + "\n" + "Author: " + getAuthor() + "\n" + "ISBN: " + getIsbn() + "\n" + "CallNumber: " + getCallNumber() + "\n" + "Collection: " + collection;
  }
  
  
}
