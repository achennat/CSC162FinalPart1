package finalpackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class finaltest {

	@Test
	public void vehicletest() {
		Person a = new Person();
		Truck truck = new Truck();
		truck.transferOwnership(a);
		
		assertEquals(truck.getOwner(), a);
		
		truck.setNumberOfAxles(2);
		
		assertEquals(truck.getNumberOfAxles(), 2);
		
		Person b = new Person();
		truck.transferOwnership(b);
		
		assertEquals(truck.getOwner(), b);
		
		MotorCycle motorcycle = new MotorCycle();
		motorcycle.setHasSideCar(false);
		
		assertEquals(motorcycle.isHasSideCar(), false);
	}

}
