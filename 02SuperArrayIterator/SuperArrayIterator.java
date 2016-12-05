// GOAL: Make SuperArray work with the enhanced for-loop.
import java.util.Iterator;
import java.util.*;
import java.*;
import java.lang.*;
public class SuperArrayIterator implements Iterator<String> {
    //Instance Variables
    int index = -1;
    SuperArray a;
    //Constructor
    public SuperArrayIterator(SuperArray x) {
	a = x;
	// Sets the given SuperArray to the instance variable a.
    }
    //Methods

    public boolean hasNext() {
	return index + 1 < a.size() && a.get(index + 1) != null;

    }
    public String next() {
	if (hasNext()) {
	    index++;
	}else{
	    throw new NoSuchElementException("No elements left to iterate");
	}

	return a.get(index);
	//return "" + index; 
    }
    public void remove() {
	throw new UnsupportedOperationException();
    }
    
}
