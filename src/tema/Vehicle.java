package tema;

public class Vehicle {
	private final String serialNumber;
	private int noPersons;
	private String name;
	private double positionX;
	private double positionY;
	private double amount;
	
	public Vehicle(String serialNumber, int noPersons) {
		this.serialNumber = serialNumber;
		this.noPersons = noPersons;
	}
	
	public Vehicle(String serialNumber, int noPersons, String name) {
		this(serialNumber, noPersons);
		this.name = name;	
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public boolean goTo(double positionX, double positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
		System.out.println("Error: unknown vehicle cannot move...");
		return false;
	}
	
	public boolean addFuel(double amount) {
		this.amount = amount;
		System.out.println("Error: unknown type of vehicle...");
		return false;
	}
	
	public void printInfo() {
		System.out.println("Vehicle properties: " + 
							"\n\t- serial number: " + this.serialNumber + 
							"\n\t-capacity: " + this.noPersons + 
							"\n\t-name: " + this.name);
	}

	public void setPositionX(double positionX) {
		this.positionX = positionX;
	}

	public void setPositionY(double positionY) {
		this.positionY = positionY;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
