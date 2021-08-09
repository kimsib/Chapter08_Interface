package ch08_1_Interface;

interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
//상수 선언
	
	// 추상 메소드
	public abstract void trunon();

	public abstract void trunoff();

	public abstract void setVolume(int volume);

}

class Television implements RemoteControl {
//필드
	
	public Television (String name) {
		
	}
	private int volume;
	@Override
	public void trunon() {
		System.out.println("TV를 켭니다.");
	}
	@Override
	public void trunoff() {
		System.out.println("TV를 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
	}

}

class Audio implements RemoteControl {

	private int volume;

	public void trunom() {
		System.out.println("Audio를 켭니다.");

	}

	public void trunoff() {
		System.out.println("Audio를 끕니다.");
	}
}

public class RemoteControlExample {
	public static void main(String[] args) {
	
		Television tv1 = new Television("삼성");
		Television tv2 = new Television("LG");
		
		tv1.trunon();
		tv2.trunon();
		
		RemoteControl rc =new TeleVision("Lg");
		rc.trunon();
		rc.setVolume(100000);
		re.trunoff();
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
