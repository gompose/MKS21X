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
      _barcode = toCode(_zip);
}

// postcondition: Creates a copy of a bar code.
  public Barcode clone(Barcode x){
      Barcode y = new Barcode(x.toString().substring(0,5));
      return y;
      
}

  private static String toCode(String zip) {
      int x = 0;
      String barcode = "|";
      int counter = 0;
      int index;
      for (x = 0; x < zip.length(); x++) {
	  barcode += _code[Integer.parseInt(zip.substring(x, x+1))];
      }
      x = 0;
      for (x = 0; x < zip.length(); x++) {
	  counter += Integer.parseInt(zip.substring(x, x+1));
      }
      index = counter % 10; 
      barcode += _code[index];
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
  // Left off over here, index out of bounds somewhere in toZip.
  public static String toZip(String code) {
      String newcode = code.substring(1);
      newcode = code.substring(0, code.length() - 6);
      //Debugging System.out.println();
      System.out.println(newcode);
      //Everything up to here works
      String zip = "";
      int x = 0;
      int i = 0;
      for (x = 0; x < code.length(); x++) {
	  i = 0;
	  newcode = newcode.substring(5);
	  for (i = 0; i < _code.length; i++) {

	      if (_code[i].compareTo(newcode.substring(0, 5)) == 0) {
		  zip += i + "";
		  		
	      }	 
	  }
      }
      return zip;	  
  }
      


}
