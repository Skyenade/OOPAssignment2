package Pack2;

import Pack1.WheeledTransportation;

public class Train extends WheeledTransportation{
	
	protected int numberOfVehicles;
	protected String NameOfTheStartingStation;
	protected String NameOfDestinationStation;
	protected long serialNumber;
	protected static long serialNumbercounter = 10000;
	
	public Train() {
		numberOfVehicles = 0;
		NameOfTheStartingStation = null;
		NameOfDestinationStation = null;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public Train(int nw, double ms,int nv, String nss, String nds) {
		super(nw, ms);
		numberOfVehicles = nv;
		NameOfTheStartingStation = nss;
		NameOfDestinationStation = nds;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public Train(Train tn) {
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

	@Override
	public String toString() {
		return "Train info: numberOfVehicles = " + numberOfVehicles +
				", Name Of The Starting Station = " + NameOfTheStartingStation +
				", Name Of Destination Station = " + NameOfDestinationStation +
				", serial Number = " + serialNumber +
				", Number of Wheels = " + getNumberOfWheels()+
				", maximum speed = " + getMaximumSpeed();
	}
	

}
