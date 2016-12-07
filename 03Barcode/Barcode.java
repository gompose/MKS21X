public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;
   private String _barcode;

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {
      _zip = zip;
      _checkDigit = checkSum(_zip) % 10;
      barcodify(_zip);
}

// postcondition: Creates a copy of a bar code.
  public Barcode clone(Barcode x){
      x = new Barcode(_zip);

}

  private void barcodify(String zip) {

      // LEFT OFF FROM HERE. WRITE BARCODIFY!
      


// postcondition: computes and returns the check sum for _zip
  private int checkSum(){
      int x = 0;
      int y = 0;
      for (x = 0, _zip.length, x++) {
	  y += Integer.parseInt(_zip.substring(x, x+1));
      }
      return y;
}

  private 

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){
      return _zip + _checkDigit + _barcode;
}


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){}
    
}
