public class Tester {
    public static void main(String[] args) {
	Barcode a = new Barcode("20483");
	Barcode b = new Barcode("75426");
	Barcode c = new Barcode("08451");

	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(a.compareTo(a));
	System.out.println(a.compareTo(b));
	System.out.println(b.compareTo(a));
	


    }
}
