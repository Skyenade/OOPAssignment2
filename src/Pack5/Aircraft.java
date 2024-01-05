package Pack5;

public class Aircraft {

	protected double price;
	protected double maxElevation;
	private long serialNumber;
	private static long serialNumbercounter = 55000;
	
	public Aircraft() {
		System.out.println("Aircraft default");
		price = 0.0;
		maxElevation = 0.0;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public Aircraft(double pr, double maxe) {
		System.out.println("Aircraft parameter");
		price = pr;
		maxElevation = maxe;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}
	
	public Aircraft(Aircraft a) {
		System.out.println("Aircraft copy");
		price = a.price;
		maxElevation = a.maxElevation;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double pr) {
		price = pr;
	}

	public double getMaxElevation() {
		return maxElevation;
	}

	public void setMaxElevation(double me) {
		maxElevation = me;
	}
	
	public void getNextSerialNumber() {
		System.out.println("comes from Aircraft");
		System.out.println("The next serial number is " + serialNumbercounter);
	}
	
	public boolean equals(Aircraft a) {
		if (a == null || a.getClass() != this.getClass()) {
	        return false;
		}
	    if (a == this) {
	        return true;
	    }
	    return false;
	}

	@Override	
	public String toString() {
		return "This Aircraft - serial# " + serialNumber + 
				" - has a maximum elevation of " + maxElevation + 
				" meters and a price of $" + price +
				".";
	}
			
}
