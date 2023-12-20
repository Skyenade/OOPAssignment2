package Pack2;

import Pack3.Metro;

public class Tram extends Metro{
	
	protected int yearOfCreation;
	protected long serialNumber;
	protected static long serialNumbercounter = 30000;
	
	public Tram() {
		yearOfCreation = 0;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public Tram(int nw, double ms, int nv, String nss, String nds, int tns, int yoc) {
		super(nw, ms, nv, nss, nds, tns);
		yearOfCreation = yoc;
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public Tram(Tram tm) {
		yearOfCreation = tm.yearOfCreation;
		setNumberOfWheels(tm.getNumberOfWheels());
		setMaximumSpeed(tm.getMaximumSpeed());
		setNumberOfVehicles(tm.getNumberOfVehicles());
		setNameOfTheStartingStation(tm.getNameOfTheStartingStation());
		setNameOfDestinationStation(tm.getNameOfDestinationStation());
		setTotalNumberOfStops(tm.getTotalNumberOfStops());
		serialNumber = serialNumbercounter;
		serialNumbercounter++;
	}

	public int getYearOfCreation() {
		return yearOfCreation;
	}

	public void setYearOfCreation(int yoc) {
		yearOfCreation = yoc;
	}
	
	public String toString() {
		return "Tram yearOfCreation" + yearOfCreation +
				", serialNumber=" + serialNumber+
				", totalNumberOfStops="+ getTotalNumberOfStops() +				
				", NumberOfVehicles="+ getNumberOfVehicles() +
				", NameOfTheStartingStation=" + getNameOfTheStartingStation()+
				", NameOfDestinationStation=" + getNameOfDestinationStation() +
				", NumberOfWheels=" + getNumberOfWheels() +
				", MaximumSpeed="+ getMaximumSpeed();
	}
	
}
