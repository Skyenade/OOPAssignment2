package Pack3;

import Pack2.Train;

public class Metro extends Train{
	
	protected int totalNumberOfStops;
	protected long serialNumber;
	protected static long serialNumbercounter = 25000;
	
	public Metro() {
		totalNumberOfStops = 0;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public Metro(int nw, double ms, int nv, String nss, String nds, int tns) {
		super(nw, ms, nv, nss, nds);
		totalNumberOfStops = tns;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}
	
	public Metro(Metro mt) {
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

	@Override
	public String toString() {
		return "Metro totalNumberOfStops=" + totalNumberOfStops +
				", serialNumber=" + serialNumber+
				", NumberOfVehicles="+ getNumberOfVehicles() +
				", NameOfTheStartingStation=" + getNameOfTheStartingStation()+
				", NameOfDestinationStation=" + getNameOfDestinationStation() +
				", NumberOfWheels=" + getNumberOfWheels() +
				", MaximumSpeed="+ getMaximumSpeed();
	}

	
	
	

}
