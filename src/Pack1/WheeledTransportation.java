package Pack1;

public class WheeledTransportation {
	
	protected int numberOfWheels;
	protected double maximumSpeed;
	protected long serialNumber;
	protected static long serialNumbercounter = 10;
	
	public WheeledTransportation() {
		numberOfWheels = 0;
		maximumSpeed = 0;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public WheeledTransportation(int nw, double ms) {
		numberOfWheels = nw;
		maximumSpeed = ms;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}
	
	public WheeledTransportation(WheeledTransportation wt) {
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

	@Override
	public String toString() {
		return "Wheeled Transportation numberOfWheels: " +numberOfWheels +
				", maximumSpeed: " + maximumSpeed
				+ ", serialNumber: " + serialNumber;
	}
	
	

}
