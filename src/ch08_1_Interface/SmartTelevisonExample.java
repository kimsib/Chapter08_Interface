package ch08_1_Interface;

interface Searchable {
	public abstract void Search(String url);
}

class SmartTelevision implements RemoteControl, Searchable {

	private int volume;
	private String name;

	public SmartTelevision(String name) {
		this.name = name;

	}

	@Override
	public void Search(String url) {
		// TODO Auto-generated method stub

	}

	@Override
	public void trunon() {
		// TODO Auto-generated method stub

	}

	@Override
	public void trunoff() {
		// TODO Auto-generated method stub

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

		System.out.println(this.name + "현재 TV 볼륨 ");
	}

}

public class SmartTelevisonExample {
	public static void main(String[] args) {

		SmartTelevision sTv = new SmartTelevision("SAMSUNG Smart TV");
		// 자동형변환
		RemoteControl rc = sTv;
		rc.trunon();

		Searchable sv = sTv;
		sv.Search("www.google.com");
	}
}
