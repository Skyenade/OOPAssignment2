package Pack3;

import Pack2.Train;

public class Metro extends Train{
	
	protected int totalNumberOfStops;
	private long serialNumber;
	private static long serialNumbercounter = 25000;
	
	public Metro() {
		System.out.println("Metro default");
		totalNumberOfStops = 0;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public Metro(int nw, double ms, int nv, String nss, String nds, int tns) {
		super(nw, ms, nv, nss, nds);
		System.out.println("Metro parameter");
		totalNumberOfStops = tns;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}
	
	public Metro(Metro mt) {
		System.out.println("Metro copy");
		totalNumberOfStops = mt.totalNumberOfStops;
		setNumberOfWheels(mt.getNumberOfWheels());
		setMaximumSpeed(mt.getMaximumSpeed());
		setNumberOfVehicles(mt.getNumberOfVehicles());
		setNameOfTheStartingStation(mt.getNameOfTheStartingStation());
		setNameOfDestinationStation(mt.getNameOfDestinationStation());
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public int getTotalNumberOfStops() {
		return totalNumberOfStops;
	}

	public void setTotalNumberOfStops(int tns) {
		totalNumberOfStops = tns;
	}
	
	public void getNextSerialNumber() {
		System.out.println("comes from Metro");
		System.out.println("The next serial number is " + serialNumbercounter);
	}
	
	public boolean equals(Metro mt) {
		if (mt == null || mt.getClass() != this.getClass()) {
	        return false;
		}
	    if (mt == this) {
	        return true;
	    }
	    return false;
	}

	@Override
	public String toString() {
		return "This Metro - serial# " + serialNumber + 
				" - has " + getNumberOfWheels() + 
				" wheels, has a maximum speed of " + getMaximumSpeed() +
				" km/h. It has " + getNumberOfVehicles() +
				" vehicles, its starting and destination stations are " + getNameOfTheStartingStation()+
				" and " + getNameOfDestinationStation() +
				". The number of stops is " + totalNumberOfStops +
				".";
	}
	
}
