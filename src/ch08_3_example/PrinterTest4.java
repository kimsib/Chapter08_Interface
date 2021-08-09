package ch08_3_example;

interface NewPrintable {
	void print(String doc);

	default void printCMYK(String doc) {
	}
}

// 기존 흑백 프린터
class OldDriver implements NewPrintable {

	public void print(String doc) {

	}
}

class NewDriver implements NewPrintable {

	@Override
	public void print(String doc) {
		System.out.println("[Samsung Sp9600CDriver black&white printing");
		System.out.println(doc + "\n"); // TODO Auto-generated method stub

	}

	@Override
	public void printCMYK(String doc) {
		System.out.println("[Samsung Sp9600CDriver Color printing");
		System.out.println(doc + "\n");
	}
}

public class PrinterTest4 {
	public static void main(String[] args) {

		String myDoc = "This is a report...";
		NewPrintable prn;
		prn = new OldDriver();
		prn.print(myDoc);
		
		prn = new NewDriver();
		prn.print(myDoc);;
		prn.printCMYK(myDoc);
		
		
		
		
		
		
		
	}
}
