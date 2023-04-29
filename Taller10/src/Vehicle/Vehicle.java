package Vehicle;

public class Vehicle {
	
	public static String MAKE = "Augur";
	public static int numVehicles=0;
	private String chassisNo;
	private String model;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String model) {
		numVehicles++;
		chassisNo = "ch" + numVehicles;
		this.model = model;
		System.out.println("Vehicle manufactured");
	}
	public static class Engine extends Vehicle {
		private static final String MAKE = "Predicter";
		private static final int CAPACITY = 1600;
		
		public Engine(String model) {
			super(model);
		}
		
		public static String getMAKE() {
			return MAKE;
		}
		
		public static int getCapacity() {
			return CAPACITY;
		}
	}
	
	public void setMake(String mak) {
		this.MAKE = mak;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getChassisNo(String chassisNo) {
		return chassisNo;
	}
	
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}
	
	public String toString() {
		return "The vehicle is manufactured by:"+ Vehicle.MAKE +"\n The model type is" + this.model + "\n The chassis number is" + chassisNo + "\n The engine make is" + Engine.getMAKE() + "\n The engine capacity is" + Engine.getCapacity() + "cc";
	}

}
