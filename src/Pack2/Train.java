package Pack2;

import Pack1.WheeledTransportation;

public class Train extends WheeledTransportation{
	
	protected int numberOfVehicles;
	protected String NameOfTheStartingStation;
	protected String NameOfDestinationStation;
	private long serialNumber;
	private static long serialNumbercounter = 10000;
	
	public Train() {
		System.out.println("Train default");
		numberOfVehicles = 0;
		NameOfTheStartingStation = null;
		NameOfDestinationStation = null;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public Train(int nw, double ms,int nv, String nss, String nds) {
		super(nw, ms);
		System.out.println("Train parameter");
		numberOfVehicles = nv;
		NameOfTheStartingStation = nss;
		NameOfDestinationStation = nds;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public Train(Train tn) {
		System.out.println("Train copy");
		numberOfVehicles = tn.numberOfVehicles;
		NameOfTheStartingStation = tn.NameOfTheStartingStation;
		NameOfDestinationStation = tn.NameOfDestinationStation;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
		setNumberOfWheels(tn.getNumberOfWheels());
		setMaximumSpeed(tn.getMaximumSpeed());
	}

	public int getNumberOfVehicles() {
		return numberOfVehicles;
	}

	public void setNumberOfVehicles(int nv) {
		numberOfVehicles = nv;
	}

	public String getNameOfTheStartingStation() {
		return NameOfTheStartingStation;
	}

	public void setNameOfTheStartingStation(String nss) {
		NameOfTheStartingStation = nss;
	}

	public String getNameOfDestinationStation() {
		return NameOfDestinationStation;
	}

	public void setNameOfDestinationStation(String nds) {
		NameOfDestinationStation = nds;
	}
	
	public void getNextSerialNumber() {
		System.out.println("comes from Train");
		System.out.println("The next serial number is " + serialNumbercounter);
	}
	
	public boolean equals(Train tn) {
		if (tn == null || tn.getClass() != this.getClass()) {
	        return false;
		}
	    if (tn == this) {
	        return true;
	    }
	    return false;
	}

	@Override
	public String toString() {
		return "This Train - serial# " + serialNumber +
				" - has " + getNumberOfWheels() +
				" wheels, has a maximum speed of " + getMaximumSpeed() + " km/h. It has " +
				numberOfVehicles + " vehicles and its starting and destination stations are " +
				NameOfTheStartingStation + " and " + NameOfDestinationStation;
	}
	

}
