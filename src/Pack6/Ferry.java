package Pack6;

public class Ferry {
	
	protected double maxSpeed;
	protected double maxLoad;
	private long serialNumber;
	private static long serialNumbercounter = 70000;
	
	public Ferry() {
		maxSpeed = 0.0;
		maxLoad = 0.0;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public Ferry(double mspeed, double mload) {
		maxSpeed = mspeed;
		maxLoad = mload;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}
	
	public Ferry(Ferry f) {
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

	@Override
	public String toString() {
		return "Ferry info: maxSpeed = " + maxSpeed +
				", maxLoad = " + maxLoad +
				", serialNumber = " + serialNumber;
	}
	
	
	
	
	
	
	
	

}
