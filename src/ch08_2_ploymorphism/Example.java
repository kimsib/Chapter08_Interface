package ch08_2_ploymorphism;

interface interfaceA {
	void methodA();

}

interface interfaceB {
	void methodB();
}

interface interfaceC extends interfaceA, interfaceB {
	void methodC();

}

class implementationC implements interfaceC {

	@Override
	public void methodA() {
	System.out.println("implementationC-methodB() 실행");

	}

	@Override
	public void methodB() {
		System.out.println("implementationC-methodB() 실행");


	}

	@Override
	public void methodC() {
		System.out.println("implementationC-methodB() 실행");


	}

}

public class Example {
public static void main(String[] args) {
	implementationC impl = new implementationC();
		interfaceA ia=impl;
		ia.method();
		System.out.println();
		
		interfaceB ib=impl;
		ib.methodB();
		System.out.println();
		
		interfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
}
}
