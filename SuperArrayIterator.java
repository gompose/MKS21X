// GOAL: Make SuperArray work with the enhanced for-loop.
import java.util.Iterator;
public class SuperArrayIterator implements Iterator<String> {
    //Instance Variables
    int index = 0;
    SuperArray a;
    //Constructor
    public SuperArrayIterator(SuperArray x) {
	a = x;
	// Sets the given SuperArray to the instance variable a.
    }
    //Methods

    public boolean hasNext() {
	return index + 1 < a.length;

    }
    public String next() {
	if (hasNext()) {
	    index++;
	}else{
	    throw NoSuchElementException("No elements left to iterate");
	}

	return a[index];
    }
    public void remove() {
	throw UnsupportedOperationException();
    }
    
}
