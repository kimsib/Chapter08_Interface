package ch08_3_example;


class SP204Driver implements printable  {
	
}
class LP830Driver {
	
}



public class PrinterTest2 {
	public static void main(String[] args) {
		String myDoc=" This is a report....";
		printable prn = null;
	
		prn = new SP204Driver();
		prn.print(mydoc);
		
		prn = new LP870Driver();
		prn.print(mydoc);
		
		
		
	}
}



































