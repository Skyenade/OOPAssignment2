package Pack6;

public class Ferry {
	
	protected double maxSpeed;
	protected double maxLoad;
	private long serialNumber;
	private static long serialNumbercounter = 70000;
	
	public Ferry() {
		System.out.println("Ferry default");
		maxSpeed = 0.0;
		maxLoad = 0.0;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public Ferry(double mspeed, double mload) {
		System.out.println("Ferry parameter");
		maxSpeed = mspeed;
		maxLoad = mload;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}
	
	public Ferry(Ferry f) {
		System.out.println("Ferry copy");
		maxSpeed = f.maxSpeed;
		maxLoad = f.maxLoad;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double mspeed) {
		maxSpeed = mspeed;
	}

	public double getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(double mload) {
		maxLoad = mload;
	}
	
	public void getNextSerialNumber() {
		System.out.println("comes from Ferry");
		System.out.println("The next serial number is " + serialNumbercounter);
	}
	
	public boolean equals(Ferry f) {
		if (f == null || f.getClass() != this.getClass()) {
	        return false;
		}
	    if (f == this) {
	        return true;
	    }
	    return false;
	}

	@Override
	public String toString() {
		return "Ferry info: maxSpeed = " + maxSpeed +
				", maxLoad = " + maxLoad +
				", serialNumber = " + serialNumber;
	}
		
}
