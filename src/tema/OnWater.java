package tema;

public class OnWater extends Vehicle{
	public OnWater(String serialNumber, int noPersons) {
		super(serialNumber, noPersons);
	}
	public OnWater(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
	}
	
	private int noEngines = 2;
	private int cargoCapacity;
	
	public OnWater(String serialNumber, int noPersons, int noEngines) {
		this(serialNumber, noPersons);
		this.noEngines = noEngines;
	}
	
	public OnWater(String serialNumber, int noPersons, int noEngines, int cargoCapacity) {
		this(serialNumber, noPersons, noEngines);
		this.cargoCapacity = noEngines;
	}
	
	 @Override
	 public boolean goTo(double positionX, double positionY) {
		 super.setPositionX(positionX);
		 super.setPositionY(positionY);
		 System.out.println("Sailing the vessel to coordinates: " + positionX + ", " + positionY);
		 return true;
		}
	 
	 @Override
	 public boolean addFuel(double amount) {
		 super.setAmount(amount) ;
		 System.out.println("Adding " + amount + " l of fuel to the vessel.");
		 return true;
	 }
	
	 @Override
	 public void printInfo() {
		super.printInfo();
		System.out.println("Vessel properties: "
				+ "\n\t- number of engines: " + this.noEngines +
				"\n\t- cargoCapacity: " + this.cargoCapacity);
	 }
}
 


