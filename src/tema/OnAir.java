package tema;

public class OnAir extends Vehicle{
	public OnAir(String serialNumber, int noPersons) {
		super(serialNumber, noPersons);
	}
	public OnAir(String serialNumber, int noPersons, String name) {
		super(serialNumber, noPersons, name);
	}
	
	private int noTurbines = 2;
	private String hasFirstClass;
	
	public OnAir(String serialNumber, int noPersons, int noTurbines) {
		this(serialNumber, noPersons);
		this.noTurbines = noTurbines;
	}
	
	public OnAir(String serialNumber, int noPersons, int noWheels, String hasFirstClass) {
		this(serialNumber, noPersons, noWheels);
		this.hasFirstClass = hasFirstClass;
	}
	
	 @Override
	 public boolean goTo(double positionX, double positionY) {
		 super.setPositionX(positionX);
		 super.setPositionY(positionY);
		 System.out.println("Flying the airplane to coordinates:" + positionX + ", " + positionY);
		 return true;
		}
	 
	 @Override
	 public boolean addFuel(double amount) {
		 super.setAmount(amount) ;
		 System.out.println("Adding " + amount + " l of fuel to the airplane.");
		 return true;
	 }
	
	 private void firstClass(String hasFirstClass) {
		 if (hasFirstClass == "Yes" || hasFirstClass == "yes") {
			 System.out.println("has first class");
		 } else {
			 System.out.println("does not have first class");
		 } 
	 }
	 
	 @Override
	 public void printInfo() {
		super.printInfo();
		System.out.print("Airplane properties: "
				+ "\n\t- number of turbines: " + this.noTurbines +
				"\n\t- ");
		firstClass(this.hasFirstClass);
	 }
}