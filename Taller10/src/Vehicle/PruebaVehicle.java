package Vehicle;

public class PruebaVehicle {
	public static void main(String[] args) {
		System.out.println("Manufactured:" + Vehicle.MAKE);
		System.out.println("Number of vehicles manufactured:" + Vehicle.numVehicles);
		
		Vehicle vehicle1 = new Vehicle("Vision");
		System.out.println("vehicle1");
		
		Vehicle vehicle2 = new Vehicle("Edict");
		System.out.println("vehicle2");
		
		vehicle2.setMake("Seer");
		System.out.println("Vehicle1");
		System.out.println("Vehicle2");
		
		Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune ");
		System.out.println("Vehicle number " + vehicle3.getChassisNo(null) + " is a " + vehicle3.getModel() + "model and has an engine capacity of " + vehicle3.getCapacity() + "cc");
		System.out.println("Number of vehicles manufactured:" + Vehicle.numVehicles);
	}

}
