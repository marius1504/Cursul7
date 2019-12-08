package tema;

public class OnRoad extends Vehicle{
	public OnRoad(String serialNumber, int noPersons) {
		super(serialNumber, noPersons);
	}
	public OnRoad(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
	}
	
	private int noWheels = 4;
	private int noDoors = 4;
	
	public OnRoad(String serialNumber, int noPersons, int noWheels) {
		this(serialNumber, noPersons);
		this.noWheels = noWheels;
	}
	
	public OnRoad(String serialNumber, int noPersons, int noWheels, int noDoors) {
		this(serialNumber, noPersons, noWheels);
		this.noDoors = noDoors;
	}
	
	 @Override
	 public boolean goTo(double positionX, double positionY) {
		 super.setPositionX(positionX);
		 super.setPositionY(positionY);
		 System.out.println("Driving the vehicle on road to coordinates:" + positionX + ", " + positionY);
		 return true;
		}
	 
	 @Override
	 public boolean addFuel(double amount) {
		 super.setAmount(amount) ;
		 System.out.println("Adding " + amount + " l of fuel to the driving vehicle.");
		 return true;
	 }
	
	 @Override
	 public void printInfo() {
		super.printInfo();
		System.out.println("Driving vehicle properties: "
				+ "\n\t- number of wheels: " + this.noWheels +
				"\n\t- number of doors: " + this.noDoors);
	 }
}
