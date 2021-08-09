package ch08_1_Interface;

class PerformanceTest {
	RemoteControl rc = new Television("LG");

	public PerformanceTest(RemoteControl rc) {
		this.rc = rc;
		rc.trunon();
		rc.setVolume(5);

	}

	void audioTest() {
		RemoteControl rc = new Audio();
		rc.trunon();
		rc.setVolume(5);
	}

	void controlTest(RemoteControl rc) {
		rc.trunon();
		rc.setVolume(5);

	}

}

public class PerformanceTestExample {
	public static void main(String[] args) {
		System.out.println("1)-----------------------------------------");
		PerformanceTest test1 = new PerformanceTest();
		test1.rc.trunon();
		test1.rc.setVolume(5);
		
		System.out.println("2-------------------------------------");
		test = new performanceTest(new Audio()	)	;
		
		System.out.println("3-------------------------------------------");
		test = new performanceTest();
		test.audiotest();
		
		System.out.println("4---------------------------------");
		test = new controlTest(new Television("samsung")); 
				
				
				
				
				
				
				
		
		
		
		
		
		
		
	}
}
