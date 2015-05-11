package finalpackage;

public class TestVehicle {

	public static void main(String[] args) {
		Person a = new Person();
		Truck truck = new Truck();
		truck.transferOwnership(a);
		truck.setNumberOfAxles(2);
		Person b = new Person();
		truck.transferOwnership(b);
		MotorCycle motorcycle = new MotorCycle();
		motorcycle.setHasSideCar(false);
	}

}
