package ch08_3_example;

public class PrinterTest1 {
	public static void main(String[] args) {
		String myDoc=" This is a report....";
			printable prn = null;
		
		
		// �Ｚ ������ ��� �˻�
			prn.print(myDoc);
		// LG ������ ��� �˻�
			prn.print(mydoc);

	}
}


class SPrinterDriver implements Printable {

	@Override
	public void print(String doc) {
		// TODO Auto-generated method stub
		
	}
	
}

class LPrinterDriver implements Printable {
	
}