package ch08_2_ploymorphism;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle Vehicle = new bus();
		Vehicle.run();
		
		Bus bus = (Bus) Vehicle;
		
		bus.run();
		bus.checkfare();
		
}
}
