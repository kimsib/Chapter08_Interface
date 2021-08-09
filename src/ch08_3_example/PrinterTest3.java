package ch08_3_example;




class Sp9600CDriver implements ColorPrintable {

	@Override
	public void printCMYK(String doc) {
		System.out.println("[Samsung Sp9600CDriver Color printing");
		System.out.println(doc + "\n");
	}

	@Override
	public void print(String doc) {
		System.out.println("[Samsung Sp9600CDriver black&white printing");
		System.out.println(doc + "\n");
	}
	
}
public class PrinterTest3 {
	public static void main(String[] args) {
		String mydoc= "This is a report...";
		
		ColorPrintable prn = new Sp9600CDriver();
		prn.print(mydoc);
		prn.printCMYK(mydoc);
		
		
	}
}
