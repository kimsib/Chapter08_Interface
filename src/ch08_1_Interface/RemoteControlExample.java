package ch08_1_Interface;

interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
//��� ����
	
	// �߻� �޼ҵ�
	public abstract void trunon();

	public abstract void trunoff();

	public abstract void setVolume(int volume);

}

class Television implements RemoteControl {
//�ʵ�
	
	public Television (String name) {
		
	}
	private int volume;
	@Override
	public void trunon() {
		System.out.println("TV�� �մϴ�.");
	}
	@Override
	public void trunoff() {
		System.out.println("TV�� ���ϴ�.");
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
		System.out.println("Audio�� �մϴ�.");

	}

	public void trunoff() {
		System.out.println("Audio�� ���ϴ�.");
	}
}

public class RemoteControlExample {
	public static void main(String[] args) {
	
		Television tv1 = new Television("�Ｚ");
		Television tv2 = new Television("LG");
		
		tv1.trunon();
		tv2.trunon();
		
		RemoteControl rc =new TeleVision("Lg");
		rc.trunon();
		rc.setVolume(100000);
		re.trunoff();
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
