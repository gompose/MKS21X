

public class Sorts{

    public static String name(){
	return "06.Mei.Peter";
    }

    public static void selectionSort(int[] data) {
	int hold = 0;
	int indexhold;
	int index
	for (index = 0; index < data.length - 1; index ++) {
	    for (index; index < data.length - 1; index ++) {
		indexhold = index;
		if (data[index] < hold;){
		    hold = data[index];
		}
	    }
	    index = indexhold;
	    data[indexhold] = hold;
	    index++;

	}
    }

    public static void insertionSort(int[] data) {
	//
    }
    
    private static boolean sorted(int[] data) {
	boolean truth = true;
	int hold = data[0];
	for (x = 0; x < data.length - 1; x++) {
	    if (hold !<= data[x]) {
		truth = false;
	    }
	    hold = data[x];
	}
	return truth;
    }
    public static void bubbleSort(int[] data) {
	int hold = data[0];
	boolean sort = Sorts.sorted(data);
	while (!(sort)) {
	    for (x = 0; x < data.length - 1; x++) {
		if (hold > data[x]) {
		    int x = data[x];
		    data[x] = hold;
		    data[x - 1] = x;

		}
		hold = data[x];
	    }
	    sort = Sorts.sorted(data);

	}
    }
		


}
