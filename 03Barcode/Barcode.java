import java.util.*;

public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;
   private String _barcode;
   private static final String[] _code = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {
      if (zip.length() != 5) {
	  throw new IllegalArgumentException("Zip is too long or short");
      }
      _zip = zip;
      _checkDigit = checkSum() % 10;
      toCode(_zip);
}

// postcondition: Creates a copy of a bar code.
  public Barcode clone(Barcode x){
      Barcode y = new Barcode(x.toString().substring(0,5));
      return y;
      
}

  private static String toCode(String zip) {
      int x = 0;
      String barcode = "|";
      for (x = 0; x < zip.length(); x++) {
	  barcode += _code[Integer.parseInt(zip.substring(x, x+1))];
      }
      barcode += _code[_checkDigit];
      barcode += "|";
      return barcode;

  }



// postcondition: computes and returns the check sum for _zip
  private int checkSum(){
      int x = 0;
      int y = 0;
      for (x = 0; x < _zip.length(); x++) {
	  y += Integer.parseInt(_zip.substring(x, x+1));
      }
      return y;
}

//postcondition: format zip + check digit + Barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){
      return _zip + _checkDigit + " " + _barcode;
}


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){
      return (_zip + _checkDigit).compareTo(other.toString().substring(0, 6));
  }
     
}
