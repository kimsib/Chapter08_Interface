package ch08_2_ploymorphism;

public class Driver {
public void drive(vehicle ve) {
	
	if(ve instanceof Bus)
	ve.run();
		
}
}
