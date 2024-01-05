package Pack1;

public class WheeledTransportation {
	
	protected int numberOfWheels;
	protected double maximumSpeed;
	protected long serialNumber;
	protected static long serialNumbercounter = 10;
	
	public WheeledTransportation() {
		System.out.println("WT default");
		numberOfWheels = 0;
		maximumSpeed = 0;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public WheeledTransportation(int nw, double ms) {
		System.out.println("WT parameter");
		numberOfWheels = nw;
		maximumSpeed = ms;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}
	
	public WheeledTransportation(WheeledTransportation wt) {
		System.out.println("WT copy");
		numberOfWheels = wt.numberOfWheels;
		maximumSpeed = wt.maximumSpeed;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public double getMaximumSpeed() {
		return maximumSpeed;
	}

	public void setMaximumSpeed(double maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}
	
	public void getNextSerialNumber() {
		System.out.println("comes from WT");
		System.out.println("The next serial number is " + serialNumbercounter);
	}
	
	
	public boolean equals(WheeledTransportation wt) {
		if (wt == null || wt.getClass() != this.getClass()) {
	        return false;
		}
	    if (wt == this) {
	        return true;
	    }
	    return true;
	}

	@Override
	public String toString() {
		return "This Wheeled Transportation - serial# " + serialNumber +
				" - has " + numberOfWheels +
				" wheels, has a maximum speed of " + maximumSpeed + " km/h.";
	}
		

}
