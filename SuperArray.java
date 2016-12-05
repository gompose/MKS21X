


public class SuperArray implements Iterable<String>{
  private String[] a;
  private int size;
  
  //0
  //constructor make an empty superArray should make size 0, 
  //but the data capacity 10.
    public SuperArray() {
	size = 0;
	String[] x = new String[1];
	a = x;
    }
    // Methods

    public Iterator<String> iterator() {
	SuperArrayIterator a = new SuperArrayIterator(a);
	while(SuperArrayIterator.hasNext()) {
	    return SuperArrayIterator.next();
	}

    }
	

    public int size(){
      return size;
  }
    public SuperArray(int initialCapacity) {
        if (initialCapacity < 0) {
	    throw new IllegalArgumentException();
        }
        size = initialCapacity;
        String[] x = new String[initialCapacity];
        a = x;
      }
    public SuperArray(String[] ary) {
	size = ary.length;
	a = ary;
    }
    

  //1
/**add the value n to the next available slot in the superArray.
 *this will change the size. This function should always work
 *And will resize the SuperArray if needed.*/

  public void add(String n){
      //Null Pointer Exception!?
      if (size >= a.length) {
	  grow();
	  size++;
	  a[size - 1] = n;
      } else {
	  size++;
	  a[size - 1] = n;
      }
	  
  }
  

  //2
/**Resize the data, by making a new array, then copying over elements, use this as your data.
*/
  private void grow(){
      String[] b = new String[size * 2];
      int counter = 0;
      while (counter < size) {
	  b[counter] = a[counter];
	  counter++;
      }
      a = b;
  }

  //3
   /**format the super array like this :   [ 1, 3, 6, 8, 23, 99, -4, 5] 
    *commas between... square bracket start/end and no comma at end.*/
  public String toString(){
      String together = "";
      int counter = 0;
      while (counter < size) {
	  together += ", " + a[counter];
	  counter++;
      }
	  
      return "[" + together.substring(1) + "]";
      
  }

  //4
    /**format the super array like this :   [ 1, 8, 23, 99, -4, 5, _, _, _, _]   
    *(capacity is 10, but only 6 are used)
    *commas between... square bracket start/end and no comma at end.
    *unused slots should be printed as _ (underscores) */
  public String toStringDebug(){
      String together = "";
      int counter = 0;
      while (counter < a.length) {
	  if (counter < size) {
              together += ", " + a[counter];
	      counter++;
	  } else {
	      together += ", _";
	      counter++;
      }
	  
    
      }
      
      
      return "[" + together.substring(1) + "]";
  }
    public boolean booleanAdd(String n){
	add(n);
	return true;
    }
    public String get(int index){
	if (index < 0 || index >= size) {
	    throw new IndexOutOfBoundsException();
	}
	return a[index];
    }
    public void clear(){
	size = 0;
    }
    public boolean isEmpty(){
	return size == 0;
    }
    public String set(int index, String element){
	if (index < 0 || index >= size) {
	    throw new IndexOutOfBoundsException();
	}
	String hold = a[index];
	a[index] = element;
	return hold;
    }
    public void add(int index, String element){
	if (index < 0 || index >= size + 1) {
	    throw new IndexOutOfBoundsException();
	}
	int slice = index;
	String[] b = new String[size + 1];
	int counter = 0;
        
	while (counter < slice) {
	    b[counter] = a[counter];
	    counter++;
	}
	size++;
	while (counter < size) {
	    b[counter] = a[counter - 1];
	    counter++;
	}
	b[index] = element;
	a = b;
    }
    
    public String remove(int index){
	if (index < 0 || index >= size) {
	    throw new IndexOutOfBoundsException();
	}
	String[] b = new String[size - 1];
	int slice = index;
	String hold = a[index];
	int counter = 0;
	while (counter < slice) {
	    b[counter] = a[counter];
	    counter++;
	}
	counter++;
	while (counter < size) {
	    b[counter - 1] = a[counter];
	    counter++;
	}
	size -= 1;
	a = b;
	return hold;
    }
    
        
    // switches the two indexes with each other.
    public String[] swap(String[] c, int index1, int index2) {
	String[] d = new String[size];
	d = c;
	String hold1 = d[index1];
	String hold2 = d[index2];
	d[index1] = hold2;
	d[index2] = hold1;
	return d;
    }
    // CURRENTLY ORDERS AND SETS AS ORDERED: RETURNS ADDRESS
    public String[] toArray() {
	int counter = 0;
	String[] b = new String[size];
	b = a;
	if (size == 0) {
	    return b;
	} else {
	    if (size == 1) {
		return b;
	    } else {
		while (counter < size - 1) {
		    if (a[counter].compareTo(a[counter + 1]) <= 0){
			counter++;
		    } else {
			b = swap(b, counter, counter + 1);
			counter = 0;
			
			    }
		}
	    }
	    a = b;
	    //return b;
	    return a;
	}
    }
    public int indexOf(String x) {
	int counter = 0;
	int hold = -1;
	boolean found = true;
	while (counter < size) {
	    if (a[counter].equals(x)) {
	        if (found){
	     	hold = counter;
	        };
	        found = false;
	        counter++;
	    } else {
	        counter++;
	    }
	
	}
	if (hold >= size) {
	    return -1;
	} else {
	    return hold;
	}
    }
    public int lastIndexOf(String x) {
	int counter = 0;
	int hold = -1;
	while (counter < size) {
	    if (a[counter].equals(x)) {
	     	hold = counter;
	        counter++;
	    } else {
	        counter++;
	    }
	
	}
	if (hold >= size) {
	    return -1;
	} else {
	    return hold;
	}
    }

    public void trimToSize() {
	String[] b = new String[size];
	int counter = 0;
        while (counter < size) {
	  b[counter] = a[counter];
	  counter++;
	}
	a = b;
    }	
	
}


